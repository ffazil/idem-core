package com.tracebucket.idem.core.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ffl on 18-08-2014.
 */
public class User {

    private String firstName;
    private String middleName;
    private String lastName;

    private String email;
    private String password;

    private Set<Authority> authorities = new HashSet<Authority>(0);
    private Set<Scope> scopes = new HashSet<Scope>(0);
}
