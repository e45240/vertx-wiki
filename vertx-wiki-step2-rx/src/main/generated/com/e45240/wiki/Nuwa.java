/*
 * This file is generated by jOOQ.
 */
package com.e45240.wiki;


import com.e45240.wiki.tables.Pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Nuwa extends SchemaImpl {

    private static final long serialVersionUID = -435715973;

    /**
     * The reference instance of <code>nuwa</code>
     */
    public static final Nuwa NUWA = new Nuwa();

    /**
     * The table <code>nuwa.pages</code>.
     */
    public final Pages PAGES = com.e45240.wiki.tables.Pages.PAGES;

    /**
     * No further instances allowed
     */
    private Nuwa() {
        super("nuwa", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Pages.PAGES);
    }
}
