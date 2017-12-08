package uk.ac.ebi.pride.cluster.tools.reanalysis.reanalysis.model.exception;

/**
 *
 * @author Kenneth Verheggen
 */
public class UnspecifiedException extends Exception {

    public UnspecifiedException(String msg) {
        super(msg);
    }

    public UnspecifiedException(Exception e) {
        super(e);
    }
}
