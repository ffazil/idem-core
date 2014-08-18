package com.tracebucket.idem.core.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ffl on 18-08-2014.
 */
public class Authority {

    private String name;
    private String description;

    private Set<Scope> scopes = new HashSet<Scope>(0);
}
