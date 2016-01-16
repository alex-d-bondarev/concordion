package org.concordion.api;

import java.util.List;

import org.concordion.api.option.ConcordionOptions;

public interface FixtureOptions {
    boolean declaresFullOGNL();

    boolean declaresFailFast();
    
    Class<? extends Throwable>[] getDeclaredFailFastExceptions();

    boolean declaresResources();

    ImplementationStatus getDeclaredImplementationStatus();

    List<ConcordionOptions> getDeclaredConcordionOptionsParentFirst();
}