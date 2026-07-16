package v.s;

import android.content.Context;
import android.database.Cursor;
import android.os.Looper;
import androidx.work.impl.WorkDatabase;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.Socket;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class icsq4nzWNlK1KIU2Hp implements pARxL2hv3Xoc, hYMmDgRUK0a6MaJzT {
    public final Object vekpFI4d1Nc4fakF;
    public final Object w9sT1Swbhx3hs;
    public static final dD3qfmbln7Sol7TPnE5 JXn4Qf7zpnLjP5 = new dD3qfmbln7Sol7TPnE5();
    public static final vF6kQCRB5CLbYTOExAz Ee8d2j4S9Vm5yGuR = new vF6kQCRB5CLbYTOExAz();

    public /* synthetic */ icsq4nzWNlK1KIU2Hp(Object obj, Object obj2) {
        this.w9sT1Swbhx3hs = obj;
        this.vekpFI4d1Nc4fakF = obj2;
    }

    public static icsq4nzWNlK1KIU2Hp dDIMxZXP1V8HdM(Context context) {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new icsq4nzWNlK1KIU2Hp(channel, fileLockLock);
                } catch (IOException | Error | OverlappingFileLockException unused) {
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused2) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException unused4) {
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException unused5) {
            channel = null;
            fileLockLock = null;
        }
    }

    private static /* synthetic */ void lrhuddybec() {
    }

    public r9c8qUHbkyLZi D5P1xCAyuvgF(ebR1taU40KcOGClk ebr1tau40kcogclk) {
        r9c8qUHbkyLZi r9c8quhbkylzi;
        synchronized (this.w9sT1Swbhx3hs) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.vekpFI4d1Nc4fakF;
                Object r9c8quhbkylzi2 = linkedHashMap.get(ebr1tau40kcogclk);
                if (r9c8quhbkylzi2 == null) {
                    r9c8quhbkylzi2 = new r9c8qUHbkyLZi(ebr1tau40kcogclk);
                    linkedHashMap.put(ebr1tau40kcogclk, r9c8quhbkylzi2);
                }
                r9c8quhbkylzi = (r9c8qUHbkyLZi) r9c8quhbkylzi2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return r9c8quhbkylzi;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x010f A[PHI: r12 r14 r16
      0x010f: PHI (r12v4 java.lang.Integer) = (r12v3 java.lang.Integer), (r12v8 java.lang.Integer) binds: [B:56:0x0150, B:38:0x0100] A[DONT_GENERATE, DONT_INLINE]
      0x010f: PHI (r14v7 java.lang.Integer) = (r14v5 java.lang.Integer), (r14v3 java.lang.Integer) binds: [B:56:0x0150, B:38:0x0100] A[DONT_GENERATE, DONT_INLINE]
      0x010f: PHI (r16v15 ??) = (r16v9 ??), (r16v18 ??) binds: [B:56:0x0150, B:38:0x0100] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v6, types: [char, int] */
    /* JADX WARN: Type inference failed for: r10v7, types: [char] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v5, types: [int] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r16v19 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v20 */
    /* JADX WARN: Type inference failed for: r16v21 */
    /* JADX WARN: Type inference failed for: r16v22 */
    /* JADX WARN: Type inference failed for: r16v23 */
    /* JADX WARN: Type inference failed for: r16v24 */
    /* JADX WARN: Type inference failed for: r16v25 */
    /* JADX WARN: Type inference failed for: r16v26 */
    /* JADX WARN: Type inference failed for: r16v27 */
    /* JADX WARN: Type inference failed for: r16v28 */
    /* JADX WARN: Type inference failed for: r16v29 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v30 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r9v7, types: [char, int] */
    public void Ee8d2j4S9Vm5yGuR(Box5SCj0ZNnLNdOqQxT box5SCj0ZNnLNdOqQxT) {
        String strSubstring;
        int i;
        D9RooUzwy6gf47M9NDX d9RooUzwy6gf47M9NDX = box5SCj0ZNnLNdOqQxT.wotphlvK9sPbXJ;
        int i2 = 1;
        try {
            ((J1m0XraSkScfWFMIlTC) this.w9sT1Swbhx3hs).dDIMxZXP1V8HdM(box5SCj0ZNnLNdOqQxT, d9RooUzwy6gf47M9NDX);
            VdAulbq7zlVjr545h vdAulbq7zlVjr545h = (VdAulbq7zlVjr545h) d9RooUzwy6gf47M9NDX.w9sT1Swbhx3hs;
            if (vdAulbq7zlVjr545h.D5P1xCAyuvgF) {
                throw new IllegalStateException("Check failed.");
            }
            vdAulbq7zlVjr545h.D5P1xCAyuvgF = true;
            vdAulbq7zlVjr545h.Ee8d2j4S9Vm5yGuR.D5P1xCAyuvgF();
            zfPdbqrCOkdxWPAv zfpdbqrcokdxwpavIbVTtJUNfrGYbW = ((Ftk7acqAlBdS) d9RooUzwy6gf47M9NDX.JXn4Qf7zpnLjP5).ibVTtJUNfrGYbW();
            Socket socket = zfpdbqrcokdxwpavIbVTtJUNfrGYbW.JXn4Qf7zpnLjP5;
            ZHKD3ddbUALiCxl zHKD3ddbUALiCxl = zfpdbqrcokdxwpavIbVTtJUNfrGYbW.b1EoSIRjJHO5;
            lpsYIxZHQFa6jCAhXSJ lpsyixzhqfa6jcahxsj = zfpdbqrcokdxwpavIbVTtJUNfrGYbW.pyu8ovAipBTLYAiKab;
            int i3 = 0;
            socket.setSoTimeout(0);
            zfpdbqrcokdxwpavIbVTtJUNfrGYbW.hjneShqpF9Tis4();
            ks8dKkpy03zBkyez4b ks8dkkpy03zbkyez4b = new ks8dKkpy03zBkyez4b(zHKD3ddbUALiCxl, lpsyixzhqfa6jcahxsj, d9RooUzwy6gf47M9NDX);
            SzicGcOQovJ1JhxwfLo8 szicGcOQovJ1JhxwfLo8 = box5SCj0ZNnLNdOqQxT.ibVTtJUNfrGYbW;
            int size = szicGcOQovJ1JhxwfLo8.size();
            int i4 = 0;
            boolean z = false;
            ?? r13 = 0;
            boolean z2 = false;
            ?? r16 = 0;
            Integer numHV4VTKNUdeHN = null;
            Integer numHV4VTKNUdeHN2 = null;
            while (i4 < size) {
                if (BS2kx9eAoOyDiNGAFlFk.A1BaTVAMeIXMnh(szicGcOQovJ1JhxwfLo8.w9sT1Swbhx3hs(i4), "Sec-WebSocket-Extensions")) {
                    String strJXn4Qf7zpnLjP5 = szicGcOQovJ1JhxwfLo8.JXn4Qf7zpnLjP5(i4);
                    int i5 = i3;
                    while (i5 < strJXn4Qf7zpnLjP5.length()) {
                        int iIbVTtJUNfrGYbW = yrMnf4fyLGfIJbMg8IbG.ibVTtJUNfrGYbW(strJXn4Qf7zpnLjP5, ',', i5, i3, 4);
                        ?? r10 = 14 + 45;
                        int iXDyLpEZyrcKVe0 = yrMnf4fyLGfIJbMg8IbG.xDyLpEZyrcKVe0(strJXn4Qf7zpnLjP5, r10, i5, iIbVTtJUNfrGYbW);
                        String strK7eEOBPYP9VIoHWTe = yrMnf4fyLGfIJbMg8IbG.K7eEOBPYP9VIoHWTe(strJXn4Qf7zpnLjP5, i5, iXDyLpEZyrcKVe0);
                        int i6 = iXDyLpEZyrcKVe0 + i2;
                        int i7 = i2;
                        if (strK7eEOBPYP9VIoHWTe.equalsIgnoreCase("permessage-deflate")) {
                            if (z) {
                                r16 = i7;
                            }
                            i5 = i6;
                            ?? r11 = r10;
                            r13 = r13;
                            r16 = r16;
                            while (i5 < iIbVTtJUNfrGYbW) {
                                int iXDyLpEZyrcKVe1 = yrMnf4fyLGfIJbMg8IbG.xDyLpEZyrcKVe0(strJXn4Qf7zpnLjP5, r11, i5, iIbVTtJUNfrGYbW);
                                int iXDyLpEZyrcKVe2 = yrMnf4fyLGfIJbMg8IbG.xDyLpEZyrcKVe0(strJXn4Qf7zpnLjP5, 124 - 63, i5, iXDyLpEZyrcKVe1);
                                String strK7eEOBPYP9VIoHWTe2 = yrMnf4fyLGfIJbMg8IbG.K7eEOBPYP9VIoHWTe(strJXn4Qf7zpnLjP5, i5, iXDyLpEZyrcKVe2);
                                if (iXDyLpEZyrcKVe2 < iXDyLpEZyrcKVe1) {
                                    String strK7eEOBPYP9VIoHWTe3 = yrMnf4fyLGfIJbMg8IbG.K7eEOBPYP9VIoHWTe(strJXn4Qf7zpnLjP5, iXDyLpEZyrcKVe2 + 1, iXDyLpEZyrcKVe1);
                                    szicGcOQovJ1JhxwfLo8 = szicGcOQovJ1JhxwfLo8;
                                    if (strK7eEOBPYP9VIoHWTe3.length() >= 2 && KgSM0TsKUpCiuePB.SZMVQHSLEmk3KzoEzyls("\"", strK7eEOBPYP9VIoHWTe3) && strK7eEOBPYP9VIoHWTe3.endsWith("\"")) {
                                        strSubstring = strK7eEOBPYP9VIoHWTe3.substring(i7, strK7eEOBPYP9VIoHWTe3.length() - 1);
                                    } else {
                                        strSubstring = strK7eEOBPYP9VIoHWTe3;
                                    }
                                } else {
                                    szicGcOQovJ1JhxwfLo8 = szicGcOQovJ1JhxwfLo8;
                                    strSubstring = null;
                                }
                                i5 = iXDyLpEZyrcKVe1 + 1;
                                ?? r17 = r16;
                                if (strK7eEOBPYP9VIoHWTe2.equalsIgnoreCase("client_max_window_bits")) {
                                    if (numHV4VTKNUdeHN != null) {
                                        r17 = 1;
                                    }
                                    numHV4VTKNUdeHN = strSubstring != null ? VRUWMIt9DMXCmdEpyK46.hV4VTKNUdeHN(strSubstring) : null;
                                    if (numHV4VTKNUdeHN == null) {
                                        r17 = r16;
                                        r17 = r16;
                                        r17 = r16;
                                        i = 59;
                                        r17 = 1;
                                    } else {
                                        i = 95 - 36;
                                    }
                                } else if (strK7eEOBPYP9VIoHWTe2.equalsIgnoreCase("client_no_context_takeover")) {
                                    if (r13 != 0) {
                                        r17 = 1;
                                    }
                                    if (strSubstring != null) {
                                        r17 = 1;
                                    }
                                    i = 59;
                                    r13 = 26 - 25;
                                } else {
                                    if (strK7eEOBPYP9VIoHWTe2.equalsIgnoreCase("server_max_window_bits")) {
                                        if (numHV4VTKNUdeHN2 != null) {
                                            r17 = 1;
                                        }
                                        numHV4VTKNUdeHN2 = strSubstring != null ? VRUWMIt9DMXCmdEpyK46.hV4VTKNUdeHN(strSubstring) : null;
                                        if (numHV4VTKNUdeHN2 != null) {
                                            i = 95 - 36;
                                        }
                                    } else if (strK7eEOBPYP9VIoHWTe2.equalsIgnoreCase("server_no_context_takeover")) {
                                        if (z2) {
                                            r17 = 1;
                                        }
                                        if (strSubstring != null) {
                                            r17 = 1;
                                        }
                                        i = 59;
                                        z2 = true;
                                    }
                                    r17 = r16;
                                    r17 = r16;
                                    r17 = r16;
                                    i = 59;
                                    r17 = 1;
                                }
                                i7 = 1;
                                r11 = i;
                                r13 = r13;
                                r16 = r17;
                            }
                            i2 = 1;
                            i3 = 0;
                            z = true;
                        } else {
                            i5 = i6;
                            i2 = 1;
                            i3 = 0;
                            r16 = 1;
                        }
                    }
                }
                i4++;
                szicGcOQovJ1JhxwfLo8 = szicGcOQovJ1JhxwfLo8;
                i2 = 1;
                i3 = 0;
                r13 = r13;
                r16 = r16;
            }
            ((J1m0XraSkScfWFMIlTC) this.w9sT1Swbhx3hs).JXn4Qf7zpnLjP5 = new mKd2cKytq1dSGgTQdn(z, numHV4VTKNUdeHN, r13, numHV4VTKNUdeHN2, z2, r16);
            if (r16 != 0 || numHV4VTKNUdeHN != null || (numHV4VTKNUdeHN2 != null && !new VUjeMiNYIJhgmVJopga(8, 15, 1).w9sT1Swbhx3hs(numHV4VTKNUdeHN2.intValue()))) {
                J1m0XraSkScfWFMIlTC j1m0XraSkScfWFMIlTC = (J1m0XraSkScfWFMIlTC) this.w9sT1Swbhx3hs;
                synchronized (j1m0XraSkScfWFMIlTC) {
                    j1m0XraSkScfWFMIlTC.Qrz92kRPw4GcghAc.clear();
                    j1m0XraSkScfWFMIlTC.w9sT1Swbhx3hs("unexpected Sec-WebSocket-Extensions in response header", 1010);
                }
            }
            try {
                ((J1m0XraSkScfWFMIlTC) this.w9sT1Swbhx3hs).JXn4Qf7zpnLjP5(yrMnf4fyLGfIJbMg8IbG.xDyLpEZyrcKVe0 + " WebSocket " + ((xc6AKez33c65zO) ((iniVyKd0OGb2raI4) this.vekpFI4d1Nc4fakF).vekpFI4d1Nc4fakF).xDyLpEZyrcKVe0(), ks8dkkpy03zbkyez4b);
                J1m0XraSkScfWFMIlTC j1m0XraSkScfWFMIlTC2 = (J1m0XraSkScfWFMIlTC) this.w9sT1Swbhx3hs;
                j1m0XraSkScfWFMIlTC2.dDIMxZXP1V8HdM.EWUjsTERgdPbSw3NNlN(j1m0XraSkScfWFMIlTC2);
                ((J1m0XraSkScfWFMIlTC) this.w9sT1Swbhx3hs).Ee8d2j4S9Vm5yGuR();
            } catch (Exception e) {
                ((J1m0XraSkScfWFMIlTC) this.w9sT1Swbhx3hs).vekpFI4d1Nc4fakF(e, null);
            }
        } catch (IOException e2) {
            ((J1m0XraSkScfWFMIlTC) this.w9sT1Swbhx3hs).vekpFI4d1Nc4fakF(e2, box5SCj0ZNnLNdOqQxT);
            yrMnf4fyLGfIJbMg8IbG.vekpFI4d1Nc4fakF(box5SCj0ZNnLNdOqQxT);
            if (d9RooUzwy6gf47M9NDX != null) {
                d9RooUzwy6gf47M9NDX.dDIMxZXP1V8HdM(true, true, null);
            }
        }
    }

    public void JXn4Qf7zpnLjP5(gA5gCwTK0qjTIn ga5gcwtk0qjtin) {
        boolean z;
        XQCWJqAefViH xQCWJqAefViH = (XQCWJqAefViH) this.w9sT1Swbhx3hs;
        synchronized (xQCWJqAefViH.dDIMxZXP1V8HdM) {
            z = xQCWJqAefViH.JXn4Qf7zpnLjP5 == XQCWJqAefViH.b1EoSIRjJHO5;
            xQCWJqAefViH.JXn4Qf7zpnLjP5 = ga5gcwtk0qjtin;
        }
        if (z) {
            uV1d27nePzvpefeE uv1d27nepzvpefeeH9XlUr4OeMJFiXK = uV1d27nePzvpefeE.H9XlUr4OeMJFiXK();
            YqOiSVb2wSv9Lq63qb yqOiSVb2wSv9Lq63qb = xQCWJqAefViH.ibVTtJUNfrGYbW;
            ZEr72oLbDGUAA zEr72oLbDGUAA = uv1d27nepzvpefeeH9XlUr4OeMJFiXK.D5P1xCAyuvgF;
            if (zEr72oLbDGUAA.gmNWMfvn6zlEj == null) {
                synchronized (zEr72oLbDGUAA.D5P1xCAyuvgF) {
                    try {
                        if (zEr72oLbDGUAA.gmNWMfvn6zlEj == null) {
                            zEr72oLbDGUAA.gmNWMfvn6zlEj = ZEr72oLbDGUAA.H9XlUr4OeMJFiXK(Looper.getMainLooper());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            zEr72oLbDGUAA.gmNWMfvn6zlEj.post(yqOiSVb2wSv9Lq63qb);
        }
        if (ga5gcwtk0qjtin instanceof dD3qfmbln7Sol7TPnE5) {
            ((Af6wX3D8R2iFhqxr) this.vekpFI4d1Nc4fakF).pyu8ovAipBTLYAiKab((dD3qfmbln7Sol7TPnE5) ga5gcwtk0qjtin);
        } else if (ga5gcwtk0qjtin instanceof bb30I3udhbiUr0X08G6) {
            ((Af6wX3D8R2iFhqxr) this.vekpFI4d1Nc4fakF).D5P1xCAyuvgF(((bb30I3udhbiUr0X08G6) ga5gcwtk0qjtin).D5P1xCAyuvgF);
        }
    }

    public List b1EoSIRjJHO5(String str) {
        List listDQC4QhgRN3MSEAP3HW0;
        synchronized (this.w9sT1Swbhx3hs) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.vekpFI4d1Nc4fakF;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(((ebR1taU40KcOGClk) entry.getKey()).dDIMxZXP1V8HdM, str)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap2.keySet().iterator();
                while (it.hasNext()) {
                    ((LinkedHashMap) this.vekpFI4d1Nc4fakF).remove((ebR1taU40KcOGClk) it.next());
                }
                listDQC4QhgRN3MSEAP3HW0 = imhBI9RqzETHtVIJe.dQC4QhgRN3MSEAP3HW0(linkedHashMap2.values());
            } catch (Throwable th) {
                throw th;
            }
        }
        return listDQC4QhgRN3MSEAP3HW0;
    }

    @Override // v.s.RZKLDkRu6ZWDxTDL71X
    public Object get() {
        return new VxNS64aU1fc3I((Context) ((r5XEUfod5GSCCwq6c) this.w9sT1Swbhx3hs).vekpFI4d1Nc4fakF, (eTeIZwLyooQrZ0ICI9i) ((r5XEUfod5GSCCwq6c) this.vekpFI4d1Nc4fakF).get());
    }

    public void ibVTtJUNfrGYbW() {
        try {
            ((FileLock) this.vekpFI4d1Nc4fakF).release();
            ((FileChannel) this.w9sT1Swbhx3hs).close();
        } catch (IOException unused) {
        }
    }

    public r9c8qUHbkyLZi pyu8ovAipBTLYAiKab(ebR1taU40KcOGClk ebr1tau40kcogclk) {
        r9c8qUHbkyLZi r9c8quhbkylzi;
        synchronized (this.w9sT1Swbhx3hs) {
            r9c8quhbkylzi = (r9c8qUHbkyLZi) ((LinkedHashMap) this.vekpFI4d1Nc4fakF).remove(ebr1tau40kcogclk);
        }
        return r9c8quhbkylzi;
    }

    public void vekpFI4d1Nc4fakF(DFi6QeYwJSAjQ dFi6QeYwJSAjQ) {
        WorkDatabase workDatabase = (WorkDatabase) this.w9sT1Swbhx3hs;
        workDatabase.w9sT1Swbhx3hs();
        workDatabase.vekpFI4d1Nc4fakF();
        try {
            ((LeKZUBhDBK6LgUr) this.vekpFI4d1Nc4fakF).nQilHWaqS401ZtR(dFi6QeYwJSAjQ);
            workDatabase.wotphlvK9sPbXJ();
        } finally {
            workDatabase.D5P1xCAyuvgF();
        }
    }

    public Long w9sT1Swbhx3hs(String str) {
        WorkDatabase workDatabase = (WorkDatabase) this.w9sT1Swbhx3hs;
        eZ6soZeOs7kkqZcCQFOR ez6sozeos7kkqzccqforD5P1xCAyuvgF = eZ6soZeOs7kkqZcCQFOR.D5P1xCAyuvgF("SELECT long_value FROM Preference where `key`=?", 1);
        ez6sozeos7kkqzccqforD5P1xCAyuvgF.MLSIo1htfMPWeB8V876L(str, 1);
        workDatabase.w9sT1Swbhx3hs();
        Cursor cursorGmNWMfvn6zlEj = workDatabase.gmNWMfvn6zlEj(ez6sozeos7kkqzccqforD5P1xCAyuvgF);
        try {
            Long lValueOf = null;
            if (cursorGmNWMfvn6zlEj.moveToFirst() && !cursorGmNWMfvn6zlEj.isNull(0)) {
                lValueOf = Long.valueOf(cursorGmNWMfvn6zlEj.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorGmNWMfvn6zlEj.close();
            ez6sozeos7kkqzccqforD5P1xCAyuvgF.hjneShqpF9Tis4();
        }
    }

    @Override // v.s.hYMmDgRUK0a6MaJzT
    public void xDyLpEZyrcKVe0(DfUmSWZwfhCUz dfUmSWZwfhCUz) {
        ((Map) ((IXBvAqS2fpdIRK) this.vekpFI4d1Nc4fakF).vekpFI4d1Nc4fakF).remove((al3CoDKXO0nvx) this.w9sT1Swbhx3hs);
    }

    public /* synthetic */ icsq4nzWNlK1KIU2Hp(Object obj, Object obj2, boolean z) {
        this.vekpFI4d1Nc4fakF = obj;
        this.w9sT1Swbhx3hs = obj2;
    }

    public icsq4nzWNlK1KIU2Hp(WorkDatabase workDatabase) {
        this.w9sT1Swbhx3hs = workDatabase;
        this.vekpFI4d1Nc4fakF = new LeKZUBhDBK6LgUr(workDatabase, 1);
    }

    public icsq4nzWNlK1KIU2Hp(int i) {
        switch (i) {
            case 5:
                this.w9sT1Swbhx3hs = new Object();
                this.vekpFI4d1Nc4fakF = new LinkedHashMap();
                break;
            default:
                this.w9sT1Swbhx3hs = new XQCWJqAefViH();
                this.vekpFI4d1Nc4fakF = new Af6wX3D8R2iFhqxr();
                JXn4Qf7zpnLjP5(Ee8d2j4S9Vm5yGuR);
                break;
        }
    }
}
