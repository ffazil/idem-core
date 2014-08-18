package com.tracebucket.idem.core.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ffl on 18-08-2014.
 */
public class Client {

    private String name;
    private String description;
    private Set<String> requestUris = new HashSet<String>(0);

    private String appKey;
    private String secretPass;

    private Application application;

    private Set<Scope> requiredScopes = new HashSet<Scope>(0);

}
