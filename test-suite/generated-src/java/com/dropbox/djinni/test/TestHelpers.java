// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from test.djinni

package com.dropbox.djinni.test;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * Helper methods used by various different tests.
 * (Second line of multi-line documentation.
 *   Indented third line of multi-line documentation.)
 */
public interface TestHelpers {
    /** Method with documentation */
    @Nonnull
    public static SetRecord getSetRecord()
    {
        return CppProxy.getSetRecord();
    }

    /**
     * Method with long documentation
     * (Second line of multi-line documentation.
     *   Indented third line of multi-line documentation.)
     */
    public static boolean checkSetRecord(@Nonnull SetRecord rec)
    {
        return CppProxy.checkSetRecord(rec);
    }

    @Nonnull
    public static PrimitiveList getPrimitiveList()
    {
        return CppProxy.getPrimitiveList();
    }

    public static boolean checkPrimitiveList(@Nonnull PrimitiveList pl)
    {
        return CppProxy.checkPrimitiveList(pl);
    }

    @Nonnull
    public static NestedCollection getNestedCollection()
    {
        return CppProxy.getNestedCollection();
    }

    public static boolean checkNestedCollection(@Nonnull NestedCollection nc)
    {
        return CppProxy.checkNestedCollection(nc);
    }

    @Nonnull
    public static HashMap<String, Long> getMap()
    {
        return CppProxy.getMap();
    }

    public static boolean checkMap(@Nonnull HashMap<String, Long> m)
    {
        return CppProxy.checkMap(m);
    }

    @Nonnull
    public static HashMap<String, Long> getEmptyMap()
    {
        return CppProxy.getEmptyMap();
    }

    public static boolean checkEmptyMap(@Nonnull HashMap<String, Long> m)
    {
        return CppProxy.checkEmptyMap(m);
    }

    @Nonnull
    public static MapListRecord getMapListRecord()
    {
        return CppProxy.getMapListRecord();
    }

    public static boolean checkMapListRecord(@Nonnull MapListRecord m)
    {
        return CppProxy.checkMapListRecord(m);
    }

    public static void checkClientInterfaceAscii(@CheckForNull ClientInterface i)
    {
        CppProxy.checkClientInterfaceAscii(i);
    }

    public static void checkClientInterfaceNonascii(@CheckForNull ClientInterface i)
    {
        CppProxy.checkClientInterfaceNonascii(i);
    }

    public static void checkClientInterfaceArgs(@CheckForNull ClientInterface i)
    {
        CppProxy.checkClientInterfaceArgs(i);
    }

    public static void checkEnumMap(@Nonnull HashMap<Color, String> m)
    {
        CppProxy.checkEnumMap(m);
    }

    public static void checkEnum(@Nonnull Color c)
    {
        CppProxy.checkEnum(c);
    }

    @CheckForNull
    public static UserToken tokenId(@CheckForNull UserToken t)
    {
        return CppProxy.tokenId(t);
    }

    @CheckForNull
    public static UserToken createCppToken()
    {
        return CppProxy.createCppToken();
    }

    public static void checkCppToken(@CheckForNull UserToken t)
    {
        CppProxy.checkCppToken(t);
    }

    public static long cppTokenId(@CheckForNull UserToken t)
    {
        return CppProxy.cppTokenId(t);
    }

    public static void checkTokenType(@CheckForNull UserToken t, @Nonnull String type)
    {
        CppProxy.checkTokenType(t,
                                type);
    }

    @CheckForNull
    public static Integer returnNone()
    {
        return CppProxy.returnNone();
    }

    /** Ensures that we generate integer translation code */
    @Nonnull
    public static AssortedPrimitives assortedPrimitivesId(@Nonnull AssortedPrimitives i)
    {
        return CppProxy.assortedPrimitivesId(i);
    }

    @Nonnull
    public static byte[] idBinary(@Nonnull byte[] b)
    {
        return CppProxy.idBinary(b);
    }

    static final class CppProxy implements TestHelpers
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

        @Nonnull
        public static native SetRecord getSetRecord();

        public static native boolean checkSetRecord(@Nonnull SetRecord rec);

        @Nonnull
        public static native PrimitiveList getPrimitiveList();

        public static native boolean checkPrimitiveList(@Nonnull PrimitiveList pl);

        @Nonnull
        public static native NestedCollection getNestedCollection();

        public static native boolean checkNestedCollection(@Nonnull NestedCollection nc);

        @Nonnull
        public static native HashMap<String, Long> getMap();

        public static native boolean checkMap(@Nonnull HashMap<String, Long> m);

        @Nonnull
        public static native HashMap<String, Long> getEmptyMap();

        public static native boolean checkEmptyMap(@Nonnull HashMap<String, Long> m);

        @Nonnull
        public static native MapListRecord getMapListRecord();

        public static native boolean checkMapListRecord(@Nonnull MapListRecord m);

        public static native void checkClientInterfaceAscii(@CheckForNull ClientInterface i);

        public static native void checkClientInterfaceNonascii(@CheckForNull ClientInterface i);

        public static native void checkClientInterfaceArgs(@CheckForNull ClientInterface i);

        public static native void checkEnumMap(@Nonnull HashMap<Color, String> m);

        public static native void checkEnum(@Nonnull Color c);

        @CheckForNull
        public static native UserToken tokenId(@CheckForNull UserToken t);

        @CheckForNull
        public static native UserToken createCppToken();

        public static native void checkCppToken(@CheckForNull UserToken t);

        public static native long cppTokenId(@CheckForNull UserToken t);

        public static native void checkTokenType(@CheckForNull UserToken t, @Nonnull String type);

        @CheckForNull
        public static native Integer returnNone();

        @Nonnull
        public static native AssortedPrimitives assortedPrimitivesId(@Nonnull AssortedPrimitives i);

        @Nonnull
        public static native byte[] idBinary(@Nonnull byte[] b);
    }
}
