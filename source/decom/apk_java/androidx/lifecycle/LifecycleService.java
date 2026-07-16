package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import v.s.Jf9nGec8iqajtj;
import v.s.Xdb7JFhCToIIjDFJDI;
import v.s.eTeIZwLyooQrZ0ICI9i;
import v.s.p9Dc9HHikKZdWDIj;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class LifecycleService extends Service implements Xdb7JFhCToIIjDFJDI {
    public final eTeIZwLyooQrZ0ICI9i dDIMxZXP1V8HdM = new eTeIZwLyooQrZ0ICI9i(this);

    private static /* synthetic */ void icpp() {
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        this.dDIMxZXP1V8HdM.JXn4Qf7zpnLjP5(Jf9nGec8iqajtj.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.dDIMxZXP1V8HdM.JXn4Qf7zpnLjP5(Jf9nGec8iqajtj.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        Jf9nGec8iqajtj jf9nGec8iqajtj = Jf9nGec8iqajtj.ON_STOP;
        eTeIZwLyooQrZ0ICI9i eteizwlyooqrz0ici9i = this.dDIMxZXP1V8HdM;
        eteizwlyooqrz0ici9i.JXn4Qf7zpnLjP5(jf9nGec8iqajtj);
        eteizwlyooqrz0ici9i.JXn4Qf7zpnLjP5(Jf9nGec8iqajtj.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        this.dDIMxZXP1V8HdM.JXn4Qf7zpnLjP5(Jf9nGec8iqajtj.ON_START);
        super.onStart(intent, i);
    }

    @Override // v.s.Xdb7JFhCToIIjDFJDI
    public final p9Dc9HHikKZdWDIj w9sT1Swbhx3hs() {
        return (p9Dc9HHikKZdWDIj) this.dDIMxZXP1V8HdM.w9sT1Swbhx3hs;
    }
}
