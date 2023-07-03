package io.github.koblizekxd.assembler;

public final class ELF {
    private final String dataName;

    private ELF(String dataName) {
        this.dataName = dataName;
    }

    public String getDataName() {
        return dataName;
    }

    /**
     * ELF64, also known as x86-64, is a 64-bit ELF format.
     * This format does support 32-bit instructions.
     * @see ELF#elf32
     * @see io.github.koblizekxd.assembler.files.Registers.x86_64
     */
    public static final ELF elf64 = new ELF("elf64");
    /**
     * ELF32, also known as x86, is a 32-bit ELF format.
     * This format does not support 64-bit instructions.
     * @see io.github.koblizekxd.assembler.files.Registers.x86
     */
    public static final ELF elf32 = new ELF("elf32");
}
