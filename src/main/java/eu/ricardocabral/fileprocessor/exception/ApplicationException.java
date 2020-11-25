package eu.ricardocabral.fileprocessor.exception;

public class ApplicationException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  public ApplicationException(String errorMessage) {
    super(errorMessage);
  }

  public ApplicationException(String errorMessage, Throwable err) {
    super(errorMessage, err);
  }
}
