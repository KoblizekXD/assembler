package io.github.koblizekxd.assembler;

public final class ELF {
    private final String dataName;

    private ELF(String dataName) {
        this.dataName = dataName;
    }

    public static final ELF elf_x86_64 = new ELF("elf_x86_64");
    public static final ELF elf32_x86_64 = new ELF("elf32_x86_64");
    public static final ELF i386 = new ELF("i386");
}
