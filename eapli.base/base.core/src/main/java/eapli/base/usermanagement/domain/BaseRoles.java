/*
 * Copyright (c) 2013-2019 the original author or authors.
 *
 * MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package eapli.base.usermanagement.domain;

import eapli.framework.infrastructure.authz.domain.model.Role;

/**
 * @author Paulo Gandra Sousa
 *
 */
public final class BaseRoles {
    /**
     * poweruser
     */
    public static final Role POWER_USER = Role.valueOf("POWER_USER");
    /**
     * Utente
     */
    public static final Role CLIENT_USER = Role.valueOf("CLIENT_USER");
    /**
     * Base Administrator
     */
    public static final Role ADMIN = Role.valueOf("ADMIN");
    /**
     *
     */
    public static final Role KITCHEN_MANAGER = Role.valueOf("KITCHEN_MANAGER");
    /**
     *
     */
    public static final Role MENU_MANAGER = Role.valueOf("MENU_MANAGER");
    /**
     *
     */
    public static final Role CASHIER = Role.valueOf("CASHIER");
    /**
     *
     */
    public static final Role HUMAN_RESOURCES_MANAGER = Role.valueOf("HUMAN_RESOURCES_MANAGER");
    /**
     *
     */
    public static final Role HELP_DESK_SERVICE_MANAGER = Role.valueOf("HELP_DESK_SERVICE_MANAGER");
     /**
     *
     */
    public static final Role COLABORATOR = Role.valueOf("COLABORATOR");
    /**
     * get available role types for adding new users
     *
     * @return
     */
    public static Role[] nonUserValues() {
        return new Role[] { ADMIN, KITCHEN_MANAGER, MENU_MANAGER, CASHIER, HUMAN_RESOURCES_MANAGER, HELP_DESK_SERVICE_MANAGER};
    }

    public boolean isColaborator(final Role role) {
        return role != CLIENT_USER;
    }
}
