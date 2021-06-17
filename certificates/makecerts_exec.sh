#!/bin/bash
STOREPASS="forgotten"
for ENT in server_eta1 server_eta2 server_eta3 server_eta4 server_eta5 client_mfa; do
 rm -f ${ENT}.jks ${ENT}.pem
 echo -e "${ENT}\nDEI\nISEP\nPORTO\nPORTO\nPT\nyes" | keytool -genkey -v -alias ${ENT} -keyalg RSA -keysize 2048 \
	-validity 365 -keystore ${ENT}.jks -storepass ${STOREPASS}
 keytool -exportcert -alias ${ENT} -keystore ${ENT}.jks -storepass ${STOREPASS} -rfc -file ${ENT}.pem
done
####
echo "Creating trust relations"
### IMPORTING TRUSTED CERTIFICATES
### (The server trusts client 
### (Every client trusts server_eta1)
for ENT in server_eta1 server_eta2 server_eta3 server_eta4 server_eta5; do
 echo "yes"|keytool -import -alias ${ENT} -keystore client_mfa.jks -file ${ENT}.pem -storepass ${STOREPASS}
 echo "yes"|keytool -import -alias client_mfa -keystore ${ENT}.jks -file client_mfa.pem -storepass ${STOREPASS}
done

echo "############################################################################"
keytool -list -keystore server_eta1.jks -storepass ${STOREPASS}
echo "############################################################################"
echo "WARNING: For testing, client4_J is not added to the list of authorized clients"
echo "############################################################################"
#######
