package okhttp3.internal.publicsuffix;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import v.s.Aqh0grSwgDbwr;
import v.s.FZ1sl4mHq4J0hOEYC;
import v.s.K3kPk3jNrQadry74Mtp;
import v.s.KgSM0TsKUpCiuePB;
import v.s.LTOYXydWjaEUtOEahWX4;
import v.s.QnMItFgHCjZ1bOS;
import v.s.TbY18sjR58Uvfbm;
import v.s.Y9mRyRdkl5FOcwb66V6;
import v.s.ZHKD3ddbUALiCxl;
import v.s.aFzDD3O0j1AOZBM7;
import v.s.imhBI9RqzETHtVIJe;
import v.s.oVCheESKQwsy4x;
import v.s.okc5AGRjqrud84oM6d;
import v.s.qkzRt1s9DJNNYwsqt;
import v.s.tntAixqOgreLyNBUe;
import v.s.ybFszvGt45UNzfQ;
import v.s.zz3xpWRzprUTdR;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class PublicSuffixDatabase {
    private static final char EXCEPTION_MARKER = '!';
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;
    public static final LTOYXydWjaEUtOEahWX4 Companion = new LTOYXydWjaEUtOEahWX4();
    private static final byte[] WILDCARD_LABEL = {42};
    private static final List<String> PREVAILING_RULE = Collections.singletonList("*");
    private static final PublicSuffixDatabase instance = new PublicSuffixDatabase();
    private final AtomicBoolean listRead = new AtomicBoolean(false);
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    private final List<String> findMatchingRule(List<String> list) {
        String str;
        String strDDIMxZXP1V8HdM;
        String strDDIMxZXP1V8HdM2;
        if (this.listRead.get() || !this.listRead.compareAndSet(false, true)) {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            readTheListUninterruptibly();
        }
        if (this.publicSuffixListBytes == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size = list.size();
        byte[][] bArr = new byte[size][];
        for (int i = 0; i < size; i++) {
            bArr[i] = list.get(i).getBytes(StandardCharsets.UTF_8);
        }
        int i2 = 0;
        while (true) {
            str = null;
            if (i2 >= size) {
                strDDIMxZXP1V8HdM = null;
                break;
            }
            LTOYXydWjaEUtOEahWX4 lTOYXydWjaEUtOEahWX4 = Companion;
            byte[] bArr2 = this.publicSuffixListBytes;
            if (bArr2 == null) {
                bArr2 = null;
            }
            strDDIMxZXP1V8HdM = LTOYXydWjaEUtOEahWX4.dDIMxZXP1V8HdM(lTOYXydWjaEUtOEahWX4, bArr2, bArr, i2);
            if (strDDIMxZXP1V8HdM != null) {
                break;
            }
            i2++;
        }
        if (size <= 1) {
            strDDIMxZXP1V8HdM2 = null;
            break;
        }
        byte[][] bArr3 = (byte[][]) bArr.clone();
        int length = bArr3.length - 1;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                strDDIMxZXP1V8HdM2 = null;
                break;
            }
            bArr3[i3] = WILDCARD_LABEL;
            LTOYXydWjaEUtOEahWX4 lTOYXydWjaEUtOEahWX5 = Companion;
            byte[] bArr4 = this.publicSuffixListBytes;
            if (bArr4 == null) {
                bArr4 = null;
            }
            strDDIMxZXP1V8HdM2 = LTOYXydWjaEUtOEahWX4.dDIMxZXP1V8HdM(lTOYXydWjaEUtOEahWX5, bArr4, bArr3, i3);
            if (strDDIMxZXP1V8HdM2 != null) {
                break;
            }
            i3++;
        }
        if (strDDIMxZXP1V8HdM2 != null) {
            int i4 = size - 1;
            for (int i5 = 0; i5 < i4; i5++) {
                LTOYXydWjaEUtOEahWX4 lTOYXydWjaEUtOEahWX6 = Companion;
                byte[] bArr5 = this.publicSuffixExceptionListBytes;
                if (bArr5 == null) {
                    bArr5 = null;
                }
                String strDDIMxZXP1V8HdM3 = LTOYXydWjaEUtOEahWX4.dDIMxZXP1V8HdM(lTOYXydWjaEUtOEahWX6, bArr5, bArr, i5);
                if (strDDIMxZXP1V8HdM3 != null) {
                    str = strDDIMxZXP1V8HdM3;
                    break;
                }
            }
        }
        if (str != null) {
            return KgSM0TsKUpCiuePB.fxMPJzvjKAjA("!".concat(str), new char[]{'.'});
        }
        if (strDDIMxZXP1V8HdM == null && strDDIMxZXP1V8HdM2 == null) {
            return PREVAILING_RULE;
        }
        List<String> listFxMPJzvjKAjA = qkzRt1s9DJNNYwsqt.w9sT1Swbhx3hs;
        List<String> listFxMPJzvjKAjA2 = strDDIMxZXP1V8HdM != null ? KgSM0TsKUpCiuePB.fxMPJzvjKAjA(strDDIMxZXP1V8HdM, new char[]{'.'}) : listFxMPJzvjKAjA;
        if (strDDIMxZXP1V8HdM2 != null) {
            listFxMPJzvjKAjA = KgSM0TsKUpCiuePB.fxMPJzvjKAjA(strDDIMxZXP1V8HdM2, new char[]{'.'});
        }
        return listFxMPJzvjKAjA2.size() > listFxMPJzvjKAjA.size() ? listFxMPJzvjKAjA2 : listFxMPJzvjKAjA;
    }

    private final void readTheList() {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(PUBLIC_SUFFIX_RESOURCE);
            if (resourceAsStream != null) {
                Logger logger = tntAixqOgreLyNBUe.dDIMxZXP1V8HdM;
                ZHKD3ddbUALiCxl zHKD3ddbUALiCxl = new ZHKD3ddbUALiCxl(new ybFszvGt45UNzfQ(new K3kPk3jNrQadry74Mtp(resourceAsStream, 1, new zz3xpWRzprUTdR())));
                try {
                    long j = zHKD3ddbUALiCxl.readInt();
                    zHKD3ddbUALiCxl.XiR1pIn5878vVWd(j);
                    byte[] bArrDVTNwpDEVsUKuznof = zHKD3ddbUALiCxl.vekpFI4d1Nc4fakF.DVTNwpDEVsUKuznof(j);
                    long j2 = zHKD3ddbUALiCxl.readInt();
                    zHKD3ddbUALiCxl.XiR1pIn5878vVWd(j2);
                    byte[] bArrDVTNwpDEVsUKuznof2 = zHKD3ddbUALiCxl.vekpFI4d1Nc4fakF.DVTNwpDEVsUKuznof(j2);
                    zHKD3ddbUALiCxl.close();
                    synchronized (this) {
                        this.publicSuffixListBytes = bArrDVTNwpDEVsUKuznof;
                        this.publicSuffixExceptionListBytes = bArrDVTNwpDEVsUKuznof2;
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(zHKD3ddbUALiCxl, th);
                        throw th2;
                    }
                }
            }
            this.readCompleteLatch.countDown();
        } catch (Throwable th3) {
            this.readCompleteLatch.countDown();
            throw th3;
        }
    }

    private final void readTheListUninterruptibly() {
        boolean z = false;
        while (true) {
            try {
                try {
                    try {
                        readTheList();
                        break;
                    } catch (InterruptedIOException unused) {
                        Thread.interrupted();
                        z = true;
                    }
                } catch (IOException e) {
                    QnMItFgHCjZ1bOS qnMItFgHCjZ1bOS = QnMItFgHCjZ1bOS.dDIMxZXP1V8HdM;
                    QnMItFgHCjZ1bOS.dDIMxZXP1V8HdM.getClass();
                    QnMItFgHCjZ1bOS.pyu8ovAipBTLYAiKab("Failed to read public suffix list", 5, e);
                    if (!z) {
                        return;
                    }
                }
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (!z) {
            return;
        }
        Thread.currentThread().interrupt();
    }

    private final List<String> splitDomain(String str) {
        int i = (-27) + 28;
        char[] cArr = new char[i];
        cArr[0] = '.';
        List<String> listFxMPJzvjKAjA = KgSM0TsKUpCiuePB.fxMPJzvjKAjA(str, cArr);
        if (listFxMPJzvjKAjA.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        if (!okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(listFxMPJzvjKAjA.get(Aqh0grSwgDbwr.EWUjsTERgdPbSw3NNlN(listFxMPJzvjKAjA)), "")) {
            return listFxMPJzvjKAjA;
        }
        int size = listFxMPJzvjKAjA.size() - i;
        return imhBI9RqzETHtVIJe.jdOQeRk37T35X5xKW1P(size >= 0 ? size : 0, listFxMPJzvjKAjA);
    }

    public final String getEffectiveTldPlusOne(String str) {
        int size;
        int size2;
        List<String> listSplitDomain = splitDomain(IDN.toUnicode(str));
        List<String> listFindMatchingRule = findMatchingRule(listSplitDomain);
        int i = 2 + 31;
        int i2 = 0;
        if (listSplitDomain.size() == listFindMatchingRule.size() && listFindMatchingRule.get(0).charAt(0) != i) {
            return null;
        }
        if (listFindMatchingRule.get(0).charAt(0) == i) {
            size = listSplitDomain.size();
            size2 = listFindMatchingRule.size();
        } else {
            size = listSplitDomain.size();
            size2 = listFindMatchingRule.size() + 1;
        }
        int i3 = size - size2;
        aFzDD3O0j1AOZBM7 ovcheeskqwsy4x = new oVCheESKQwsy4x(0, splitDomain(str));
        if (i3 < 0) {
            throw new IllegalArgumentException(Y9mRyRdkl5FOcwb66V6.b1EoSIRjJHO5("Requested element count ", " is less than zero.", i3).toString());
        }
        if (i3 != 0) {
            ovcheeskqwsy4x = new TbY18sjR58Uvfbm(ovcheeskqwsy4x, i3);
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        for (Object obj : ovcheeskqwsy4x) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) ".");
            }
            FZ1sl4mHq4J0hOEYC.dDIMxZXP1V8HdM(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public final void setListBytes(byte[] bArr, byte[] bArr2) {
        this.publicSuffixListBytes = bArr;
        this.publicSuffixExceptionListBytes = bArr2;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }
}
