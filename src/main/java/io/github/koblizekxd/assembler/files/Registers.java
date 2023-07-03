package io.github.koblizekxd.assembler.files;

public final class Registers {
    private Registers() {}

    /**
     * All x86_64 registers use this class.
     * It extends {@link x86} to ability to use x86 registers in x64.
     */
    public static class x86_64 extends x86 {
        public x86_64(String name) {
            super(name);
        }
    }

    /**
     * All x86 registers use this class.
     */
    public static class x86 {
        private final String name;
        public x86(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
    }

    public static final x86_64 rax = new x86_64("rax");
    public static final x86_64 rbx = new x86_64("rbx");
    public static final x86_64 rcx = new x86_64("rcx");
    public static final x86_64 rdx = new x86_64("rdx");
    public static final x86_64 rsi = new x86_64("rsi");
    public static final x86_64 rdi = new x86_64("rdi");
    public static final x86_64 rbp = new x86_64("rbp");
    public static final x86_64 rsp = new x86_64("rsp");
}
