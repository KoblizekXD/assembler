package io.github.koblizekxd.assembler.error;

public class InvalidCompilationDataException extends RuntimeException {
    public InvalidCompilationDataException() {
        super();
    }
    public InvalidCompilationDataException(String message) {
        super(message);
    }
    public static final InvalidCompilationDataException UNSPECIFIED_FORMAT
            = new InvalidCompilationDataException("ELF format & usable assembler was not specified");
}
