package v.s;

import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class W6dfON4KdcdxlH implements qrp1qtE91LqdmL, As2k35rSTTZ3RAUS, aTR0Fvd9tAh4Aa, TbaRGxkAafT5, pARxL2hv3Xoc {
    public final /* synthetic */ int w9sT1Swbhx3hs;
    public static final /* synthetic */ W6dfON4KdcdxlH vekpFI4d1Nc4fakF = new W6dfON4KdcdxlH(1);
    public static final W6dfON4KdcdxlH JXn4Qf7zpnLjP5 = new W6dfON4KdcdxlH(2);
    public static final W6dfON4KdcdxlH Ee8d2j4S9Vm5yGuR = new W6dfON4KdcdxlH(3);
    public static final W6dfON4KdcdxlH xDyLpEZyrcKVe0 = new W6dfON4KdcdxlH(4);
    public static final W6dfON4KdcdxlH ibVTtJUNfrGYbW = new W6dfON4KdcdxlH(5);
    public static final W6dfON4KdcdxlH b1EoSIRjJHO5 = new W6dfON4KdcdxlH(6);
    public static final W6dfON4KdcdxlH pyu8ovAipBTLYAiKab = new W6dfON4KdcdxlH(7);
    public static final /* synthetic */ W6dfON4KdcdxlH D5P1xCAyuvgF = new W6dfON4KdcdxlH(8);

    public /* synthetic */ W6dfON4KdcdxlH(int i) {
        this.w9sT1Swbhx3hs = i;
    }

    public static final qG9NzchKqUM6 JXn4Qf7zpnLjP5(W6dfON4KdcdxlH w6dfON4KdcdxlH, String str) {
        qG9NzchKqUM6 qg9nzchkqum6 = new qG9NzchKqUM6(str);
        qG9NzchKqUM6.JXn4Qf7zpnLjP5.put(str, qg9nzchkqum6);
        return qg9nzchkqum6;
    }

    private static /* synthetic */ void haqgsvnh() {
    }

    public synchronized qG9NzchKqUM6 Ee8d2j4S9Vm5yGuR(String str) {
        qG9NzchKqUM6 qg9nzchkqum6;
        String strConcat;
        try {
            LinkedHashMap linkedHashMap = qG9NzchKqUM6.JXn4Qf7zpnLjP5;
            qg9nzchkqum6 = (qG9NzchKqUM6) linkedHashMap.get(str);
            if (qg9nzchkqum6 == null) {
                if (str.startsWith("TLS_")) {
                    strConcat = "SSL_".concat(str.substring(4));
                } else {
                    strConcat = str.startsWith("SSL_") ? "TLS_".concat(str.substring(4)) : str;
                }
                qg9nzchkqum6 = (qG9NzchKqUM6) linkedHashMap.get(strConcat);
                if (qg9nzchkqum6 == null) {
                    qg9nzchkqum6 = new qG9NzchKqUM6(str);
                }
                linkedHashMap.put(str, qg9nzchkqum6);
            }
        } catch (Throwable th) {
            throw th;
        }
        return qg9nzchkqum6;
    }

    @Override // v.s.aTR0Fvd9tAh4Aa
    public Object dDIMxZXP1V8HdM(DfUmSWZwfhCUz dfUmSWZwfhCUz) throws IOException {
        if (dfUmSWZwfhCUz.xDyLpEZyrcKVe0()) {
            return (Bundle) dfUmSWZwfhCUz.JXn4Qf7zpnLjP5();
        }
        if (Log.isLoggable("Rpc", 3)) {
            "Error making request: ".concat(String.valueOf(dfUmSWZwfhCUz.vekpFI4d1Nc4fakF()));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", dfUmSWZwfhCUz.vekpFI4d1Nc4fakF());
    }

    @Override // v.s.RZKLDkRu6ZWDxTDL71X
    public Object get() {
        fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6l = new fEyMFFyOOvHURJ7To6L((-27) + 45);
        HashMap map = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(LB7U1qakabytBm.w9sT1Swbhx3hs, new oHwsq5s6lj9C1(30000L, 86400000L, set));
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(LB7U1qakabytBm.JXn4Qf7zpnLjP5, new oHwsq5s6lj9C1(1000L, 86400000L, set));
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(W14DdGhrJlsYoApqU.vekpFI4d1Nc4fakF)));
        if (setUnmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(LB7U1qakabytBm.vekpFI4d1Nc4fakF, new oHwsq5s6lj9C1(86400000L, 86400000L, setUnmodifiableSet));
        if (map.keySet().size() < LB7U1qakabytBm.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new GYJ3wxVSK6wC(feymffyoovhurj7to6l, map);
    }

    @Override // v.s.TbaRGxkAafT5
    public z4xRvJ1RJf5JDR vekpFI4d1Nc4fakF(b4HNTST9eKD8OwjVF8x b4hntst9ekd8owjvf8x) {
        return new wIulk4QxNLn4s(b4hntst9ekd8owjvf8x.dDIMxZXP1V8HdM, b4hntst9ekd8owjvf8x.w9sT1Swbhx3hs, b4hntst9ekd8owjvf8x.vekpFI4d1Nc4fakF, b4hntst9ekd8owjvf8x.JXn4Qf7zpnLjP5, b4hntst9ekd8owjvf8x.Ee8d2j4S9Vm5yGuR);
    }

    @Override // v.s.As2k35rSTTZ3RAUS
    public Object w9sT1Swbhx3hs(iniVyKd0OGb2raI4 inivykd0ogb2rai4) {
        switch (this.w9sT1Swbhx3hs) {
            case 3:
                return new rPTA1zWZR3GTVlGPw((Executor) inivykd0ogb2rai4.vekpFI4d1Nc4fakF(new QwPxr2jx1iGLmehgkv3g(G6671wZlei2pbk4f8.class, Executor.class)));
            case 4:
                return new rPTA1zWZR3GTVlGPw((Executor) inivykd0ogb2rai4.vekpFI4d1Nc4fakF(new QwPxr2jx1iGLmehgkv3g(rvAS0S3hc9OcOpI2kG.class, Executor.class)));
            default:
                return new rPTA1zWZR3GTVlGPw((Executor) inivykd0ogb2rai4.vekpFI4d1Nc4fakF(new QwPxr2jx1iGLmehgkv3g(GFeyKt8p4Qhv.class, Executor.class)));
        }
    }

    public W6dfON4KdcdxlH() {
        this.w9sT1Swbhx3hs = 18;
        List list = Collections.EMPTY_LIST;
    }
}
