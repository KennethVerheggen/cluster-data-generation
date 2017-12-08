package uk.ac.ebi.pride.cluster.tools.reanalysis.reanalysis.model.processing;

import uk.ac.ebi.pride.cluster.tools.reanalysis.reanalysis.model.exception.ProcessingException;
import uk.ac.ebi.pride.cluster.tools.reanalysis.reanalysis.model.exception.UnspecifiedException;

import java.util.HashMap;

public interface ProcessingExecutable {

    /**
     * Executes an external executable from another tool.
     *
     * @return a boolean to indicate if the process finished correctly
     * @throws uk.ac.ebi.pride.cluster.tools.reanalysis.reanalysis.model.exception.UnspecifiedException
     * @throws uk.ac.ebi.pride.cluster.tools.reanalysis.reanalysis.model.exception.ProcessingException
    */
    boolean process() throws UnspecifiedException,ProcessingException;

    /**
     *
     * @return the description of the executable
     */
    String getDescription();

    /**
     *
     * @return the parameters of the executable
     */
    HashMap<String, String> getParameters();
}
