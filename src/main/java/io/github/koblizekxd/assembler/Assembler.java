package io.github.koblizekxd.assembler;

import io.github.koblizekxd.assembler.external.ICompiler;

public final class Assembler {
    private static ELF elf;
    private static Class<ICompiler> assembler;

    private Assembler() {}

    public static void use(ELF elf, Class<ICompiler> assembler) {
        Assembler.elf = elf;
        Assembler.assembler = assembler;
    }
}
