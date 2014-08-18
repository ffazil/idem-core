package com.tracebucket.idem.core.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ffl on 18-08-2014.
 */
public class Permission {

    private Application application;
    private Client client;
    private User user;
    private Set<Scope> allowedScopes = new HashSet<Scope>(0);

}
