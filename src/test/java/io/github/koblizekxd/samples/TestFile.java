package io.github.koblizekxd.samples;

import io.github.koblizekxd.assembler.Assembler;
import io.github.koblizekxd.assembler.ELF;
import io.github.koblizekxd.assembler.external.NASM;
import io.github.koblizekxd.assembler.files.AssemblyFile;
import io.github.koblizekxd.assembler.files.Registers;
import static io.github.koblizekxd.assembler.files.Registers.*;

public class TestFile extends AssemblyFile {
    public static void main(String[] args) {
        Assembler.use(ELF.elf64, NASM.class);
        Assembler.compile(new TestFile());
    }
}
