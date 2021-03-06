// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from enum.djinni

package com.dropbox.djinni.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

public interface EnumUsageInterface {
    @Nonnull
    public Color e(@Nonnull Color e);

    @CheckForNull
    public Color o(@CheckForNull Color o);

    @Nonnull
    public ArrayList<Color> l(@Nonnull ArrayList<Color> l);

    @Nonnull
    public HashSet<Color> s(@Nonnull HashSet<Color> s);

    @Nonnull
    public HashMap<Color, Color> m(@Nonnull HashMap<Color, Color> m);

    static final class CppProxy implements EnumUsageInterface
    {
        private final long nativeRef;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);

        private CppProxy(long nativeRef)
        {
            if (nativeRef == 0) throw new RuntimeException("nativeRef is zero");
            this.nativeRef = nativeRef;
        }

        private native void nativeDestroy(long nativeRef);
        public void destroy()
        {
            boolean destroyed = this.destroyed.getAndSet(true);
            if (!destroyed) nativeDestroy(this.nativeRef);
        }
        protected void finalize() throws java.lang.Throwable
        {
            destroy();
            super.finalize();
        }

        @Override
        public Color e(Color e)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_e(this.nativeRef, e);
        }
        private native Color native_e(long _nativeRef, Color e);

        @Override
        public Color o(Color o)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_o(this.nativeRef, o);
        }
        private native Color native_o(long _nativeRef, Color o);

        @Override
        public ArrayList<Color> l(ArrayList<Color> l)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_l(this.nativeRef, l);
        }
        private native ArrayList<Color> native_l(long _nativeRef, ArrayList<Color> l);

        @Override
        public HashSet<Color> s(HashSet<Color> s)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_s(this.nativeRef, s);
        }
        private native HashSet<Color> native_s(long _nativeRef, HashSet<Color> s);

        @Override
        public HashMap<Color, Color> m(HashMap<Color, Color> m)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_m(this.nativeRef, m);
        }
        private native HashMap<Color, Color> native_m(long _nativeRef, HashMap<Color, Color> m);
    }
}
