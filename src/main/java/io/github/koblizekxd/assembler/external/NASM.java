package io.github.koblizekxd.assembler.external;

import io.github.koblizekxd.assembler.ELF;

public final class NASM implements ICompiler {
    private NASM() {}

    @Override
    public String getCompilationCommand(ELF elf) {
        return null;
    }
}
