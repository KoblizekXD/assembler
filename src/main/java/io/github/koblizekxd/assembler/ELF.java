package io.github.koblizekxd.assembler;

public final class ELF {
    private final String dataName;

    private ELF(String dataName) {
        this.dataName = dataName;
    }

    public static final ELF elf64 = new ELF("elf64");
    public static final ELF elf32 = new ELF("elf32");
    public static final ELF elfx32 = new ELF("elfx32");
}
