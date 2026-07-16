package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import v.s.JAq04eEIRbdKN3s5wgEm;
import v.s.OFMrQsTe5s1KYV0lq;
import v.s.OFtLBiBbrrTHWu;
import v.s.RIZfHbqXpth8r2yN4;
import v.s.SbxdZ6Kq2uhHQ5RPRqm;
import v.s.SvaRwOgSe9xmOs;
import v.s.UE6365QWSHVg5Fff;
import v.s.r5XEUfod5GSCCwq6c;
import v.s.z9jFFGDhxLM5EJdr0q;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    private static /* synthetic */ void zgtjbn() {
    }

    /* JADX WARN: Code duplicated, block: B:101:0x018b A[Catch: all -> 0x01a0, TRY_LEAVE, TryCatch #0 {all -> 0x01a0, blocks: (B:99:0x017f, B:101:0x018b, B:110:0x01a3), top: B:204:0x017f, outer: #23 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x01a3 A[Catch: all -> 0x01a0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x01a0, blocks: (B:99:0x017f, B:101:0x018b, B:110:0x01a3), top: B:204:0x017f, outer: #23 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:125:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:126:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:134:0x01ee A[Catch: all -> 0x0215, LOOP:0: B:132:0x01e8->B:134:0x01ee, LOOP_END, TryCatch #20 {all -> 0x0215, blocks: (B:131:0x01e6, B:132:0x01e8, B:134:0x01ee, B:135:0x01f3), top: B:224:0x01e6, outer: #19 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x023b  */
    /* JADX WARN: Code duplicated, block: B:169:0x0249  */
    /* JADX WARN: Code duplicated, block: B:232:0x01d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x017a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x01f3 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24, types: [byte[], v.s.SvaRwOgSe9xmOs[]] */
    /* JADX WARN: Type inference failed for: r3v25 */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        FileInputStream fileInputStreamDDIMxZXP1V8HdM;
        SvaRwOgSe9xmOs[] svaRwOgSe9xmOsArrRCHnHJBAlOpNI5;
        r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c;
        SvaRwOgSe9xmOs[] svaRwOgSe9xmOsArr;
        byte[] bArr;
        byte[] bArr2;
        ?? r3;
        ByteArrayInputStream byteArrayInputStream;
        FileOutputStream fileOutputStream;
        byte[] bArr3;
        int i;
        ByteArrayOutputStream byteArrayOutputStream;
        int i2;
        JAq04eEIRbdKN3s5wgEm jAq04eEIRbdKN3s5wgEm;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        boolean z = false;
        if (!"androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                    if ("WRITE_SKIP_FILE".equals(string)) {
                        try {
                            OFMrQsTe5s1KYV0lq.nQilHWaqS401ZtR(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                            setResultCode(10);
                            return;
                        } catch (PackageManager.NameNotFoundException unused) {
                            setResultCode(7);
                            return;
                        }
                    }
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        setResultCode(10 + 1);
                        return;
                    }
                    return;
                }
                return;
            }
            if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
                Process.sendSignal(Process.myPid(), 10);
                setResultCode(12);
                return;
            } else {
                if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
                    return;
                }
                if (!"DROP_SHADER_CACHE".equals(extras.getString("EXTRA_BENCHMARK_OPERATION"))) {
                    setResultCode(29 - 13);
                    return;
                } else if (RIZfHbqXpth8r2yN4.JXn4Qf7zpnLjP5(context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                    setResultCode(14);
                    return;
                } else {
                    setResultCode(15);
                    return;
                }
            }
        }
        UE6365QWSHVg5Fff uE6365QWSHVg5Fff = new UE6365QWSHVg5Fff(1);
        r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c2 = new r5XEUfod5GSCCwq6c(97 - 81, this);
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            context.getPackageName();
            byte[] bArr4 = OFtLBiBbrrTHWu.vekpFI4d1Nc4fakF;
            int i3 = Build.VERSION.SDK_INT;
            File file = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            JAq04eEIRbdKN3s5wgEm jAq04eEIRbdKN3s5wgEm2 = new JAq04eEIRbdKN3s5wgEm(assets, uE6365QWSHVg5Fff, r5xeufod5gsccwq6c2, name, file);
            byte[] bArr5 = jAq04eEIRbdKN3s5wgEm2.w9sT1Swbhx3hs;
            if (bArr5 == null) {
                jAq04eEIRbdKN3s5wgEm2.w9sT1Swbhx3hs(3, Integer.valueOf(i3));
            } else if (file.canWrite()) {
                jAq04eEIRbdKN3s5wgEm2.Ee8d2j4S9Vm5yGuR = true;
                try {
                    fileInputStreamDDIMxZXP1V8HdM = jAq04eEIRbdKN3s5wgEm2.dDIMxZXP1V8HdM(assets, "dexopt/baseline.prof");
                } catch (FileNotFoundException e) {
                    r5xeufod5gsccwq6c2.DVTNwpDEVsUKuznof(6, e);
                    fileInputStreamDDIMxZXP1V8HdM = null;
                } catch (IOException e2) {
                    r5xeufod5gsccwq6c2.DVTNwpDEVsUKuznof(7, e2);
                    fileInputStreamDDIMxZXP1V8HdM = null;
                }
                try {
                    if (fileInputStreamDDIMxZXP1V8HdM != null) {
                        try {
                            try {
                                if (!Arrays.equals(bArr4, SbxdZ6Kq2uhHQ5RPRqm.dTS0S7eC32ubQH54j36(fileInputStreamDDIMxZXP1V8HdM, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                svaRwOgSe9xmOsArrRCHnHJBAlOpNI5 = OFtLBiBbrrTHWu.rCHnHJBAlOpNI5(fileInputStreamDDIMxZXP1V8HdM, SbxdZ6Kq2uhHQ5RPRqm.dTS0S7eC32ubQH54j36(fileInputStreamDDIMxZXP1V8HdM, 4), jAq04eEIRbdKN3s5wgEm2.JXn4Qf7zpnLjP5);
                                try {
                                    fileInputStreamDDIMxZXP1V8HdM.close();
                                } catch (IOException e3) {
                                    r5xeufod5gsccwq6c2.DVTNwpDEVsUKuznof(7, e3);
                                }
                                jAq04eEIRbdKN3s5wgEm2.xDyLpEZyrcKVe0 = svaRwOgSe9xmOsArrRCHnHJBAlOpNI5;
                            } catch (IllegalStateException e4) {
                                r5xeufod5gsccwq6c2.DVTNwpDEVsUKuznof(8, e4);
                                try {
                                    fileInputStreamDDIMxZXP1V8HdM.close();
                                } catch (IOException e5) {
                                    r5xeufod5gsccwq6c2.DVTNwpDEVsUKuznof(7, e5);
                                }
                                svaRwOgSe9xmOsArrRCHnHJBAlOpNI5 = null;
                            }
                        } catch (IOException e6) {
                            r5xeufod5gsccwq6c2.DVTNwpDEVsUKuznof(7, e6);
                            fileInputStreamDDIMxZXP1V8HdM.close();
                            svaRwOgSe9xmOsArrRCHnHJBAlOpNI5 = null;
                        }
                    }
                    SvaRwOgSe9xmOs[] svaRwOgSe9xmOsArr2 = jAq04eEIRbdKN3s5wgEm2.xDyLpEZyrcKVe0;
                    if (svaRwOgSe9xmOsArr2 != null && (i2 = Build.VERSION.SDK_INT) <= 33) {
                        switch (i2) {
                            case 31:
                            case 32:
                            case 33:
                                try {
                                    FileInputStream fileInputStreamDDIMxZXP1V8HdM2 = jAq04eEIRbdKN3s5wgEm2.dDIMxZXP1V8HdM(assets, "dexopt/baseline.profm");
                                    if (fileInputStreamDDIMxZXP1V8HdM2 != null) {
                                        try {
                                            if (!Arrays.equals(OFtLBiBbrrTHWu.JXn4Qf7zpnLjP5, SbxdZ6Kq2uhHQ5RPRqm.dTS0S7eC32ubQH54j36(fileInputStreamDDIMxZXP1V8HdM2, 4))) {
                                                throw new IllegalStateException("Invalid magic");
                                            }
                                            jAq04eEIRbdKN3s5wgEm2.xDyLpEZyrcKVe0 = OFtLBiBbrrTHWu.EWUjsTERgdPbSw3NNlN(fileInputStreamDDIMxZXP1V8HdM2, SbxdZ6Kq2uhHQ5RPRqm.dTS0S7eC32ubQH54j36(fileInputStreamDDIMxZXP1V8HdM2, 4), bArr5, svaRwOgSe9xmOsArr2);
                                            fileInputStreamDDIMxZXP1V8HdM2.close();
                                            jAq04eEIRbdKN3s5wgEm = jAq04eEIRbdKN3s5wgEm2;
                                        } catch (Throwable th) {
                                            try {
                                                fileInputStreamDDIMxZXP1V8HdM2.close();
                                                throw th;
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                                throw th;
                                            }
                                        }
                                    } else {
                                        if (fileInputStreamDDIMxZXP1V8HdM2 != null) {
                                            fileInputStreamDDIMxZXP1V8HdM2.close();
                                        }
                                        jAq04eEIRbdKN3s5wgEm = null;
                                    }
                                } catch (FileNotFoundException e7) {
                                    r5xeufod5gsccwq6c2.DVTNwpDEVsUKuznof(9, e7);
                                } catch (IOException e8) {
                                    r5xeufod5gsccwq6c2.DVTNwpDEVsUKuznof(7, e8);
                                } catch (IllegalStateException e9) {
                                    jAq04eEIRbdKN3s5wgEm2.xDyLpEZyrcKVe0 = null;
                                    r5xeufod5gsccwq6c2.DVTNwpDEVsUKuznof(8, e9);
                                }
                                if (jAq04eEIRbdKN3s5wgEm != null) {
                                    jAq04eEIRbdKN3s5wgEm2 = jAq04eEIRbdKN3s5wgEm;
                                    break;
                                }
                            default:
                                r5xeufod5gsccwq6c = jAq04eEIRbdKN3s5wgEm2.dDIMxZXP1V8HdM;
                                svaRwOgSe9xmOsArr = jAq04eEIRbdKN3s5wgEm2.xDyLpEZyrcKVe0;
                                bArr = jAq04eEIRbdKN3s5wgEm2.w9sT1Swbhx3hs;
                                if (svaRwOgSe9xmOsArr != null && bArr != null) {
                                    if (jAq04eEIRbdKN3s5wgEm2.Ee8d2j4S9Vm5yGuR) {
                                        throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    }
                                    try {
                                        byteArrayOutputStream = new ByteArrayOutputStream();
                                        try {
                                            byteArrayOutputStream.write(bArr4);
                                            byteArrayOutputStream.write(bArr);
                                            if (OFtLBiBbrrTHWu.fivkjwgu2UdAtiY(byteArrayOutputStream, bArr, svaRwOgSe9xmOsArr)) {
                                                jAq04eEIRbdKN3s5wgEm2.ibVTtJUNfrGYbW = byteArrayOutputStream.toByteArray();
                                                byteArrayOutputStream.close();
                                                jAq04eEIRbdKN3s5wgEm2.xDyLpEZyrcKVe0 = null;
                                            } else {
                                                r5xeufod5gsccwq6c.DVTNwpDEVsUKuznof(5, null);
                                                jAq04eEIRbdKN3s5wgEm2.xDyLpEZyrcKVe0 = null;
                                                byteArrayOutputStream.close();
                                            }
                                        } catch (Throwable th3) {
                                            try {
                                                byteArrayOutputStream.close();
                                                throw th3;
                                            } catch (Throwable th4) {
                                                th3.addSuppressed(th4);
                                                throw th3;
                                            }
                                        }
                                    } catch (IOException e10) {
                                        r5xeufod5gsccwq6c.DVTNwpDEVsUKuznof(7, e10);
                                    } catch (IllegalStateException e11) {
                                        r5xeufod5gsccwq6c.DVTNwpDEVsUKuznof(8, e11);
                                    }
                                }
                                bArr2 = jAq04eEIRbdKN3s5wgEm2.ibVTtJUNfrGYbW;
                                if (bArr2 != null) {
                                    z = false;
                                } else {
                                    try {
                                        if (jAq04eEIRbdKN3s5wgEm2.Ee8d2j4S9Vm5yGuR) {
                                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                        }
                                        try {
                                            byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                            try {
                                                fileOutputStream = new FileOutputStream(jAq04eEIRbdKN3s5wgEm2.vekpFI4d1Nc4fakF);
                                                try {
                                                    bArr3 = new byte[512];
                                                    while (true) {
                                                        i = byteArrayInputStream.read(bArr3);
                                                        if (i > 0) {
                                                            fileOutputStream.write(bArr3, 0, i);
                                                        } else {
                                                            jAq04eEIRbdKN3s5wgEm2.w9sT1Swbhx3hs(1, null);
                                                            fileOutputStream.close();
                                                            byteArrayInputStream.close();
                                                            jAq04eEIRbdKN3s5wgEm2.ibVTtJUNfrGYbW = null;
                                                            jAq04eEIRbdKN3s5wgEm2.xDyLpEZyrcKVe0 = null;
                                                            z = true;
                                                        }
                                                        try {
                                                            byteArrayInputStream.close();
                                                            throw th;
                                                        } catch (Throwable th5) {
                                                            th.addSuppressed(th5);
                                                            throw th;
                                                        }
                                                    }
                                                } catch (Throwable th6) {
                                                    try {
                                                        fileOutputStream.close();
                                                        throw th6;
                                                    } catch (Throwable th7) {
                                                        th6.addSuppressed(th7);
                                                        throw th6;
                                                    }
                                                }
                                            } catch (Throwable th8) {
                                                byteArrayInputStream.close();
                                                throw th8;
                                            }
                                        } catch (FileNotFoundException e12) {
                                            r3 = 0;
                                            jAq04eEIRbdKN3s5wgEm2.w9sT1Swbhx3hs(6, e12);
                                            jAq04eEIRbdKN3s5wgEm2.ibVTtJUNfrGYbW = r3;
                                            jAq04eEIRbdKN3s5wgEm2.xDyLpEZyrcKVe0 = r3;
                                            z = false;
                                        } catch (IOException e13) {
                                            jAq04eEIRbdKN3s5wgEm2.w9sT1Swbhx3hs(7, e13);
                                            r3 = 0;
                                            jAq04eEIRbdKN3s5wgEm2.ibVTtJUNfrGYbW = r3;
                                            jAq04eEIRbdKN3s5wgEm2.xDyLpEZyrcKVe0 = r3;
                                            z = false;
                                        }
                                    } catch (Throwable th9) {
                                        jAq04eEIRbdKN3s5wgEm2.ibVTtJUNfrGYbW = null;
                                        jAq04eEIRbdKN3s5wgEm2.xDyLpEZyrcKVe0 = null;
                                        throw th9;
                                    }
                                }
                                if (z) {
                                    OFMrQsTe5s1KYV0lq.nQilHWaqS401ZtR(packageInfo, filesDir);
                                }
                                break;
                        }
                    }
                    r5xeufod5gsccwq6c = jAq04eEIRbdKN3s5wgEm2.dDIMxZXP1V8HdM;
                    svaRwOgSe9xmOsArr = jAq04eEIRbdKN3s5wgEm2.xDyLpEZyrcKVe0;
                    bArr = jAq04eEIRbdKN3s5wgEm2.w9sT1Swbhx3hs;
                    if (svaRwOgSe9xmOsArr != null) {
                        if (jAq04eEIRbdKN3s5wgEm2.Ee8d2j4S9Vm5yGuR) {
                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                        }
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        byteArrayOutputStream.write(bArr4);
                        byteArrayOutputStream.write(bArr);
                        if (OFtLBiBbrrTHWu.fivkjwgu2UdAtiY(byteArrayOutputStream, bArr, svaRwOgSe9xmOsArr)) {
                            r5xeufod5gsccwq6c.DVTNwpDEVsUKuznof(5, null);
                            jAq04eEIRbdKN3s5wgEm2.xDyLpEZyrcKVe0 = null;
                            byteArrayOutputStream.close();
                        } else {
                            jAq04eEIRbdKN3s5wgEm2.ibVTtJUNfrGYbW = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            jAq04eEIRbdKN3s5wgEm2.xDyLpEZyrcKVe0 = null;
                        }
                    }
                    bArr2 = jAq04eEIRbdKN3s5wgEm2.ibVTtJUNfrGYbW;
                    if (bArr2 != null) {
                        if (jAq04eEIRbdKN3s5wgEm2.Ee8d2j4S9Vm5yGuR) {
                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                        }
                        byteArrayInputStream = new ByteArrayInputStream(bArr2);
                        fileOutputStream = new FileOutputStream(jAq04eEIRbdKN3s5wgEm2.vekpFI4d1Nc4fakF);
                        bArr3 = new byte[512];
                        while (true) {
                            i = byteArrayInputStream.read(bArr3);
                            if (i > 0) {
                                fileOutputStream.write(bArr3, 0, i);
                            } else {
                                jAq04eEIRbdKN3s5wgEm2.w9sT1Swbhx3hs(1, null);
                                fileOutputStream.close();
                                byteArrayInputStream.close();
                                jAq04eEIRbdKN3s5wgEm2.ibVTtJUNfrGYbW = null;
                                jAq04eEIRbdKN3s5wgEm2.xDyLpEZyrcKVe0 = null;
                                z = true;
                            }
                            byteArrayInputStream.close();
                            throw th8;
                        }
                    }
                    z = false;
                    if (z) {
                        OFMrQsTe5s1KYV0lq.nQilHWaqS401ZtR(packageInfo, filesDir);
                    }
                } catch (Throwable th10) {
                    try {
                        fileInputStreamDDIMxZXP1V8HdM.close();
                        throw th10;
                    } catch (IOException e14) {
                        r5xeufod5gsccwq6c2.DVTNwpDEVsUKuznof(7, e14);
                        throw th10;
                    }
                }
            } else {
                jAq04eEIRbdKN3s5wgEm2.w9sT1Swbhx3hs(4, null);
            }
            z9jFFGDhxLM5EJdr0q.vekpFI4d1Nc4fakF(context, z);
        } catch (PackageManager.NameNotFoundException e15) {
            r5xeufod5gsccwq6c2.DVTNwpDEVsUKuznof(7, e15);
            z9jFFGDhxLM5EJdr0q.vekpFI4d1Nc4fakF(context, false);
        }
    }
}
