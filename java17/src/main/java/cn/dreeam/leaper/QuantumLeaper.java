package cn.dreeam.leaper;

/**
 * Retains the QuantumLeaper entry point while allowing agents to patch Paperclip.
 */
public final class QuantumLeaper {

    public static void main(final String[] args) {
        io.papermc.paperclip.Paperclip.main(args);
    }
}
