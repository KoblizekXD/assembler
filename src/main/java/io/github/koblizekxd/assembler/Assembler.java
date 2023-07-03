package io.github.koblizekxd.assembler;

import io.github.koblizekxd.assembler.error.InvalidCompilationDataException;
import io.github.koblizekxd.assembler.external.ICompiler;
import io.github.koblizekxd.assembler.files.AssemblyFile;

public final class Assembler {
    private static ELF elf;
    private static Class<? extends ICompiler> assembler;

    private Assembler() {}

    public static void use(ELF elf, Class<? extends ICompiler> assembler) {
        Assembler.elf = elf;
        Assembler.assembler = assembler;
    }
    private static void checkFormat() {
        if (elf == null || assembler == null) {
            throw InvalidCompilationDataException.UNSPECIFIED_FORMAT;
        }
    }
    public static void compile(AssemblyFile file) {

    }
}
