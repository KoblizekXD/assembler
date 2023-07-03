package io.github.koblizekxd.samples;

import io.github.koblizekxd.assembler.Assembler;
import io.github.koblizekxd.assembler.ELF;
import io.github.koblizekxd.assembler.external.NASM;
import io.github.koblizekxd.assembler.files.AssemblyFile;

public class TestFile extends AssemblyFile {
    public static void main(String[] args) {
        Assembler.use(ELF.elfx32, NASM.class);
        Assembler.compile(new TestFile());
    }

}
