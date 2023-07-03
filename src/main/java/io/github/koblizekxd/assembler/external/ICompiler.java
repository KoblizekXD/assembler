package io.github.koblizekxd.assembler.external;

import io.github.koblizekxd.assembler.ELF;

public interface ICompiler {
    String getCompilationCommand(ELF elf);
}
