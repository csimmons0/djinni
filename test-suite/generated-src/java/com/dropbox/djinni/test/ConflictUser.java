// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from test.djinni

package com.dropbox.djinni.test;

import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

public interface ConflictUser {
    @CheckForNull
    public Conflict Conflict();

    public boolean conflictArg(@Nonnull HashSet<Conflict> cs);

    static final class CppProxy implements ConflictUser
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
        public Conflict Conflict()
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_Conflict(this.nativeRef);
        }
        private native Conflict native_Conflict(long _nativeRef);

        @Override
        public boolean conflictArg(HashSet<Conflict> cs)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_conflictArg(this.nativeRef, cs);
        }
        private native boolean native_conflictArg(long _nativeRef, HashSet<Conflict> cs);
    }
}
