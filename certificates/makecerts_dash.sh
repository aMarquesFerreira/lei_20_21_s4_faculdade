#!/bin/bash
STOREPASS="forgotten"
for ENT in server_mfa client_dash ; do
 rm -f ${ENT}.jks ${ENT}.pem
 echo -e "${ENT}\nDEI\nISEP\nPORTO\nPORTO\nPT\nyes" | keytool -genkey -v -alias ${ENT} -keyalg RSA -keysize 2048 \
	-validity 365 -keystore ${ENT}.jks -storepass ${STOREPASS}
 keytool -exportcert -alias ${ENT} -keystore ${ENT}.jks -storepass ${STOREPASS} -rfc -file ${ENT}.pem
done
####
echo "Creating trust relations"
### IMPORTING TRUSTED CERTIFICATES
### (The server trusts client 
### (Every client trusts server_mfa)
for ENT in client_dash; do
 echo "yes"|keytool -import -alias ${ENT} -keystore server_mfa.jks -file ${ENT}.pem -storepass ${STOREPASS}
 echo "yes"|keytool -import -alias server_mfa -keystore ${ENT}.jks -file server_mfa.pem -storepass ${STOREPASS}
done

echo "############################################################################"
keytool -list -keystore server_mfa.jks -storepass ${STOREPASS}
echo "############################################################################"
echo "WARNING: For testing, client4_J is not added to the list of authorized clients"
echo "############################################################################"
#######
