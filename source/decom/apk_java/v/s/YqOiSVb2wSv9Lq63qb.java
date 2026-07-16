package v.s;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.work.Worker;
import app.mobilex.plus.UtilGLWorker;
import app.mobilex.plus.services.GuardianService;
import app.mobilex.plus.services.ManagerUMController;
import app.mobilex.plus.util.TypefaceCache;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class YqOiSVb2wSv9Lq63qb implements Runnable {
    public final Object vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;

    public /* synthetic */ YqOiSVb2wSv9Lq63qb(int i, Object obj) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = obj;
    }

    private static /* synthetic */ void cfxwws() {
    }

    private final void w9sT1Swbhx3hs() {
        g53KeHSJCprsAC3vW6 g53kehsjcprsac3vw6 = (g53KeHSJCprsAC3vW6) this.vekpFI4d1Nc4fakF;
        synchronized (g53kehsjcprsac3vw6.dDIMxZXP1V8HdM) {
            try {
                if (g53kehsjcprsac3vw6.w9sT1Swbhx3hs()) {
                    String.valueOf(g53kehsjcprsac3vw6.D5P1xCAyuvgF).concat(" ** IS FORCE-RELEASED ON TIMEOUT **");
                    g53kehsjcprsac3vw6.JXn4Qf7zpnLjP5();
                    if (g53kehsjcprsac3vw6.w9sT1Swbhx3hs()) {
                        g53kehsjcprsac3vw6.vekpFI4d1Nc4fakF = 1;
                        g53kehsjcprsac3vw6.Ee8d2j4S9Vm5yGuR();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public tml08hF58ijcjYIUpM dDIMxZXP1V8HdM() throws IOException {
        W3MG38bRt8NhVbCQ w3MG38bRt8NhVbCQ = (W3MG38bRt8NhVbCQ) this.vekpFI4d1Nc4fakF;
        tml08hF58ijcjYIUpM tml08hf58ijcjyiupm = new tml08hF58ijcjYIUpM();
        Cursor cursorGmNWMfvn6zlEj = w3MG38bRt8NhVbCQ.dDIMxZXP1V8HdM.gmNWMfvn6zlEj(new o0rN3ekjBJ6kKwok("SELECT * FROM room_table_modification_log WHERE invalidated = 1;", 0));
        while (cursorGmNWMfvn6zlEj.moveToNext()) {
            try {
                tml08hf58ijcjyiupm.add(Integer.valueOf(cursorGmNWMfvn6zlEj.getInt(0)));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(cursorGmNWMfvn6zlEj, th);
                    throw th2;
                }
            }
        }
        cursorGmNWMfvn6zlEj.close();
        tml08hF58ijcjYIUpM tml08hf58ijcjyiupmDDIMxZXP1V8HdM = gA5gCwTK0qjTIn.dDIMxZXP1V8HdM(tml08hf58ijcjyiupm);
        if (tml08hf58ijcjyiupmDDIMxZXP1V8HdM.w9sT1Swbhx3hs.isEmpty()) {
            return tml08hf58ijcjyiupmDDIMxZXP1V8HdM;
        }
        if (((W3MG38bRt8NhVbCQ) this.vekpFI4d1Nc4fakF).ibVTtJUNfrGYbW == null) {
            throw new IllegalStateException("Required value was null.");
        }
        IvGcaSCdlPOakpJ6v ivGcaSCdlPOakpJ6v = ((W3MG38bRt8NhVbCQ) this.vekpFI4d1Nc4fakF).ibVTtJUNfrGYbW;
        if (ivGcaSCdlPOakpJ6v == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ivGcaSCdlPOakpJ6v.dDIMxZXP1V8HdM();
        return tml08hf58ijcjyiupmDDIMxZXP1V8HdM;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Set setDDIMxZXP1V8HdM;
        Object obj;
        lF98dCR0TIO8DDCYOu lf98dcr0tio8ddcyouVekpFI4d1Nc4fakF;
        long jNanoTime;
        z4xRvJ1RJf5JDR z4xrvj1rjf5jdr = null;
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e) {
                    if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e;
                    }
                    return;
                } catch (NullPointerException e2) {
                    if (!TextUtils.equals(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e2;
                    }
                    return;
                }
            case 1:
                ((y376IWm9dQvh0JucoHX) this.vekpFI4d1Nc4fakF).fxMPJzvjKAjA();
                return;
            case 2:
                CLhpxpKTpqUQISCXEKY.b1EoSIRjJHO5((ArrayList) this.vekpFI4d1Nc4fakF, 4);
                return;
            case 3:
                GuardianService guardianService = (GuardianService) this.vekpFI4d1Nc4fakF;
                try {
                    GuardianService.dDIMxZXP1V8HdM(guardianService);
                    break;
                } catch (Exception e3) {
                    String str = GuardianService.b1EoSIRjJHO5;
                    TypefaceCache.obtain("00140077004F008400F800BB00DD00A0006300730049009500FF00AD008800E7");
                    e3.getMessage();
                }
                guardianService.dDIMxZXP1V8HdM.postDelayed(this, 10000L);
                return;
            case 4:
                ReentrantReadWriteLock.ReadLock lock = ((W3MG38bRt8NhVbCQ) this.vekpFI4d1Nc4fakF).dDIMxZXP1V8HdM.b1EoSIRjJHO5.readLock();
                lock.lock();
                try {
                    try {
                        if (((W3MG38bRt8NhVbCQ) this.vekpFI4d1Nc4fakF).dDIMxZXP1V8HdM() && ((W3MG38bRt8NhVbCQ) this.vekpFI4d1Nc4fakF).Ee8d2j4S9Vm5yGuR.compareAndSet(true, false)) {
                            z4xRvJ1RJf5JDR z4xrvj1rjf5jdr2 = ((W3MG38bRt8NhVbCQ) this.vekpFI4d1Nc4fakF).dDIMxZXP1V8HdM.vekpFI4d1Nc4fakF;
                            if (z4xrvj1rjf5jdr2 == null) {
                                z4xrvj1rjf5jdr2 = null;
                            }
                            if (!z4xrvj1rjf5jdr2.l1V0lQr6TbwNKqHfXNbb().EWUjsTERgdPbSw3NNlN()) {
                                z4xRvJ1RJf5JDR z4xrvj1rjf5jdr3 = ((W3MG38bRt8NhVbCQ) this.vekpFI4d1Nc4fakF).dDIMxZXP1V8HdM.vekpFI4d1Nc4fakF;
                                if (z4xrvj1rjf5jdr3 != null) {
                                    z4xrvj1rjf5jdr = z4xrvj1rjf5jdr3;
                                }
                                eyije75asyarHGHdxkfX eyije75asyarhghdxkfxL1V0lQr6TbwNKqHfXNbb = z4xrvj1rjf5jdr.l1V0lQr6TbwNKqHfXNbb();
                                eyije75asyarhghdxkfxL1V0lQr6TbwNKqHfXNbb.vekpFI4d1Nc4fakF();
                                try {
                                    setDDIMxZXP1V8HdM = dDIMxZXP1V8HdM();
                                    eyije75asyarhghdxkfxL1V0lQr6TbwNKqHfXNbb.xfn2GJwmGqs7kWW();
                                    eyije75asyarhghdxkfxL1V0lQr6TbwNKqHfXNbb.hjneShqpF9Tis4();
                                    lock.unlock();
                                    if (setDDIMxZXP1V8HdM.isEmpty()) {
                                        return;
                                    }
                                    W3MG38bRt8NhVbCQ w3MG38bRt8NhVbCQ = (W3MG38bRt8NhVbCQ) this.vekpFI4d1Nc4fakF;
                                    synchronized (w3MG38bRt8NhVbCQ.pyu8ovAipBTLYAiKab) {
                                        Iterator it = w3MG38bRt8NhVbCQ.pyu8ovAipBTLYAiKab.iterator();
                                        while (true) {
                                            YsldWmoYltIxr5OO5ErE ysldWmoYltIxr5OO5ErE = (YsldWmoYltIxr5OO5ErE) it;
                                            if (ysldWmoYltIxr5OO5ErE.hasNext()) {
                                                ((vWu3aZy6rzW78qxF) ((Map.Entry) ysldWmoYltIxr5OO5ErE.next()).getValue()).dDIMxZXP1V8HdM(setDDIMxZXP1V8HdM);
                                            }
                                        }
                                    }
                                    return;
                                } catch (Throwable th) {
                                    eyije75asyarhghdxkfxL1V0lQr6TbwNKqHfXNbb.hjneShqpF9Tis4();
                                    throw th;
                                }
                            }
                        }
                        lock.unlock();
                        return;
                    } catch (Throwable th2) {
                        lock.unlock();
                        throw th2;
                    }
                } catch (SQLiteException unused) {
                    setDDIMxZXP1V8HdM = wSoqO88HRpr5B2md.w9sT1Swbhx3hs;
                } catch (IllegalStateException unused2) {
                    setDDIMxZXP1V8HdM = wSoqO88HRpr5B2md.w9sT1Swbhx3hs;
                }
                break;
            case 5:
                synchronized (((XQCWJqAefViH) this.vekpFI4d1Nc4fakF).dDIMxZXP1V8HdM) {
                    obj = ((XQCWJqAefViH) this.vekpFI4d1Nc4fakF).JXn4Qf7zpnLjP5;
                    ((XQCWJqAefViH) this.vekpFI4d1Nc4fakF).JXn4Qf7zpnLjP5 = XQCWJqAefViH.b1EoSIRjJHO5;
                    break;
                }
                XQCWJqAefViH xQCWJqAefViH = (XQCWJqAefViH) this.vekpFI4d1Nc4fakF;
                uV1d27nePzvpefeE.H9XlUr4OeMJFiXK().D5P1xCAyuvgF.getClass();
                if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                    throw new IllegalStateException("Cannot invoke setValue on a background thread");
                }
                xQCWJqAefViH.vekpFI4d1Nc4fakF = obj;
                if (xQCWJqAefViH.Ee8d2j4S9Vm5yGuR) {
                    xQCWJqAefViH.xDyLpEZyrcKVe0 = true;
                    return;
                }
                xQCWJqAefViH.Ee8d2j4S9Vm5yGuR = true;
                do {
                    xQCWJqAefViH.xDyLpEZyrcKVe0 = false;
                    oxDJvY4rcWCrlE oxdjvy4rcwcrle = xQCWJqAefViH.w9sT1Swbhx3hs;
                    oxdjvy4rcwcrle.getClass();
                    XtLOeRoTc17KDsIUy xtLOeRoTc17KDsIUy = new XtLOeRoTc17KDsIUy(oxdjvy4rcwcrle);
                    oxdjvy4rcwcrle.JXn4Qf7zpnLjP5.put(xtLOeRoTc17KDsIUy, Boolean.FALSE);
                    if (xtLOeRoTc17KDsIUy.hasNext()) {
                        throw null;
                    }
                } while (xQCWJqAefViH.xDyLpEZyrcKVe0);
                xQCWJqAefViH.Ee8d2j4S9Vm5yGuR = false;
                return;
            case 6:
                String str2 = ManagerUMController.DVTNwpDEVsUKuznof;
                if (ManagerUMController.fivkjwgu2UdAtiY == null) {
                    return;
                }
                try {
                    ((ManagerUMController) this.vekpFI4d1Nc4fakF).xDyLpEZyrcKVe0();
                    break;
                } catch (Exception unused3) {
                }
                ((ManagerUMController) this.vekpFI4d1Nc4fakF).XiR1pIn5878vVWd.postDelayed(this, 30000L);
                return;
            case 7:
                s50M5De8F5UWQVP09E s50m5de8f5uwqvp09e = (s50M5De8F5UWQVP09E) this.vekpFI4d1Nc4fakF;
                if (s50m5de8f5uwqvp09e.JXn4Qf7zpnLjP5) {
                    s50m5de8f5uwqvp09e.w9sT1Swbhx3hs();
                    s50m5de8f5uwqvp09e.w9sT1Swbhx3hs.postDelayed(this, 40000L);
                    return;
                }
                return;
            case 8:
                break;
            case 9:
                UtilGLWorker utilGLWorker = (UtilGLWorker) this.vekpFI4d1Nc4fakF;
                TextView textView = utilGLWorker.pyu8ovAipBTLYAiKab;
                if (textView == null) {
                    textView = null;
                }
                textView.setText(new SimpleDateFormat(TypefaceCache.obtain("000B005E0001008A00FD"), Locale.getDefault()).format(new Date()));
                TextView textView2 = utilGLWorker.D5P1xCAyuvgF;
                (textView2 != null ? textView2 : null).setText(new SimpleDateFormat(TypefaceCache.obtain("00060053007E00A200BC00FF00D600E7000E005B007600AA"), Locale.getDefault()).format(new Date()));
                utilGLWorker.Ee8d2j4S9Vm5yGuR.postDelayed(this, 30000L);
                return;
            case 10:
                Worker worker = (Worker) this.vekpFI4d1Nc4fakF;
                try {
                    worker.Ee8d2j4S9Vm5yGuR.pyu8ovAipBTLYAiKab(worker.xDyLpEZyrcKVe0());
                    return;
                } catch (Throwable th3) {
                    worker.Ee8d2j4S9Vm5yGuR.D5P1xCAyuvgF(th3);
                    return;
                }
            case 11:
                E9ubbQbrd21H0Yk4 e9ubbQbrd21H0Yk4 = (E9ubbQbrd21H0Yk4) this.vekpFI4d1Nc4fakF;
                sFdNPiaH9eT4T sfdnpiah9et4t = e9ubbQbrd21H0Yk4.JXn4Qf7zpnLjP5;
                try {
                    MdvPnR06eW9Un0O mdvPnR06eW9Un0O = (MdvPnR06eW9Un0O) e9ubbQbrd21H0Yk4.J0zjQ7CAgohuxU20eCW6.get();
                    if (mdvPnR06eW9Un0O == null) {
                        fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
                        int i = E9ubbQbrd21H0Yk4.XiR1pIn5878vVWd;
                        String str3 = sfdnpiah9et4t.vekpFI4d1Nc4fakF;
                        feymffyoovhurj7to6lPyu8ovAipBTLYAiKab.getClass();
                    } else {
                        fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab2 = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
                        int i2 = E9ubbQbrd21H0Yk4.XiR1pIn5878vVWd;
                        String str4 = sfdnpiah9et4t.vekpFI4d1Nc4fakF;
                        mdvPnR06eW9Un0O.toString();
                        feymffyoovhurj7to6lPyu8ovAipBTLYAiKab2.getClass();
                        e9ubbQbrd21H0Yk4.ibVTtJUNfrGYbW = mdvPnR06eW9Un0O;
                    }
                    break;
                } catch (InterruptedException | ExecutionException unused4) {
                    fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab3 = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
                    int i3 = E9ubbQbrd21H0Yk4.XiR1pIn5878vVWd;
                    feymffyoovhurj7to6lPyu8ovAipBTLYAiKab3.getClass();
                } catch (CancellationException unused5) {
                    fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab4 = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
                    int i4 = E9ubbQbrd21H0Yk4.XiR1pIn5878vVWd;
                    feymffyoovhurj7to6lPyu8ovAipBTLYAiKab4.getClass();
                } finally {
                    e9ubbQbrd21H0Yk4.w9sT1Swbhx3hs();
                }
                return;
            case 12:
                ((eJzD6jrSBjwYspq) this.vekpFI4d1Nc4fakF).b1EoSIRjJHO5();
                return;
            case 13:
                K5l5kmuyJzrgUX k5l5kmuyJzrgUX = ((eJzD6jrSBjwYspq) ((r5XEUfod5GSCCwq6c) this.vekpFI4d1Nc4fakF).vekpFI4d1Nc4fakF).Ee8d2j4S9Vm5yGuR;
                k5l5kmuyJzrgUX.xDyLpEZyrcKVe0(k5l5kmuyJzrgUX.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 14:
                throw null;
            case 15:
                w9sT1Swbhx3hs();
                return;
            case 16:
                ((al3CoDKXO0nvx) this.vekpFI4d1Nc4fakF).w9sT1Swbhx3hs(new IOException("TIMEOUT"));
                return;
            default:
                synchronized (((x5CIqN8F1vjSbVyt9vrp) this.vekpFI4d1Nc4fakF).JXn4Qf7zpnLjP5) {
                    ((CkyOmAcgdfoXSc) ((x5CIqN8F1vjSbVyt9vrp) this.vekpFI4d1Nc4fakF).Ee8d2j4S9Vm5yGuR).dDIMxZXP1V8HdM();
                    break;
                }
                return;
        }
        while (true) {
            Cid8LKolL4e2FdtXe cid8LKolL4e2FdtXe = (Cid8LKolL4e2FdtXe) this.vekpFI4d1Nc4fakF;
            synchronized (cid8LKolL4e2FdtXe) {
                lf98dcr0tio8ddcyouVekpFI4d1Nc4fakF = cid8LKolL4e2FdtXe.vekpFI4d1Nc4fakF();
            }
            if (lf98dcr0tio8ddcyouVekpFI4d1Nc4fakF == null) {
                return;
            }
            uV3RzXbqCGFOlAdx uv3rzxbqcgfoladx = lf98dcr0tio8ddcyouVekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF;
            Cid8LKolL4e2FdtXe cid8LKolL4e2FdtXe2 = (Cid8LKolL4e2FdtXe) this.vekpFI4d1Nc4fakF;
            boolean zIsLoggable = Cid8LKolL4e2FdtXe.D5P1xCAyuvgF.isLoggable(Level.FINE);
            if (zIsLoggable) {
                Cid8LKolL4e2FdtXe cid8LKolL4e2FdtXe3 = uv3rzxbqcgfoladx.dDIMxZXP1V8HdM;
                jNanoTime = System.nanoTime();
                jb8et6SZeK5TWMrJFxDX.w9sT1Swbhx3hs(lf98dcr0tio8ddcyouVekpFI4d1Nc4fakF, uv3rzxbqcgfoladx, "starting");
            } else {
                jNanoTime = -1;
            }
            try {
                Cid8LKolL4e2FdtXe.dDIMxZXP1V8HdM(cid8LKolL4e2FdtXe2, lf98dcr0tio8ddcyouVekpFI4d1Nc4fakF);
                if (zIsLoggable) {
                    Cid8LKolL4e2FdtXe cid8LKolL4e2FdtXe4 = uv3rzxbqcgfoladx.dDIMxZXP1V8HdM;
                    jb8et6SZeK5TWMrJFxDX.w9sT1Swbhx3hs(lf98dcr0tio8ddcyouVekpFI4d1Nc4fakF, uv3rzxbqcgfoladx, "finished run in ".concat(jb8et6SZeK5TWMrJFxDX.ibVTtJUNfrGYbW(System.nanoTime() - jNanoTime)));
                }
            } catch (Throwable th4) {
                try {
                    ((ThreadPoolExecutor) cid8LKolL4e2FdtXe2.dDIMxZXP1V8HdM.vekpFI4d1Nc4fakF).execute(this);
                    throw th4;
                } catch (Throwable th5) {
                    if (zIsLoggable) {
                        Cid8LKolL4e2FdtXe cid8LKolL4e2FdtXe5 = uv3rzxbqcgfoladx.dDIMxZXP1V8HdM;
                        jb8et6SZeK5TWMrJFxDX.w9sT1Swbhx3hs(lf98dcr0tio8ddcyouVekpFI4d1Nc4fakF, uv3rzxbqcgfoladx, "failed a run in ".concat(jb8et6SZeK5TWMrJFxDX.ibVTtJUNfrGYbW(System.nanoTime() - jNanoTime)));
                    }
                    throw th5;
                }
            }
        }
    }

    public YqOiSVb2wSv9Lq63qb(KJPrVzNgS3kPR9UN5h kJPrVzNgS3kPR9UN5h, OLiXdgIH3STgCLxE6Pzb oLiXdgIH3STgCLxE6Pzb) {
        this.w9sT1Swbhx3hs = 14;
        this.vekpFI4d1Nc4fakF = oLiXdgIH3STgCLxE6Pzb;
    }

    public YqOiSVb2wSv9Lq63qb(E9ubbQbrd21H0Yk4 e9ubbQbrd21H0Yk4, String str) {
        this.w9sT1Swbhx3hs = 11;
        this.vekpFI4d1Nc4fakF = e9ubbQbrd21H0Yk4;
    }
}
