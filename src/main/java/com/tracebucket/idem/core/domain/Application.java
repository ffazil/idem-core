package com.tracebucket.idem.core.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ffl on 18-08-2014.
 */
public class Application {

    private String name;
    private String domain;
    private String description;

    private Set<Scope> scopes = new HashSet<Scope>(0);
    private Set<Authority> authorities = new HashSet<Authority>(0);
    private Set<User> users = new HashSet<User>(0);
}
