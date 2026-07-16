package v.s;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.work.impl.WorkDatabase;
import app.mobilex.plus.services.SyncQYAdapter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class rziO4QJcO9ArAydJLO implements Callable {
    public final /* synthetic */ int dDIMxZXP1V8HdM;
    public final /* synthetic */ Object w9sT1Swbhx3hs;

    public /* synthetic */ rziO4QJcO9ArAydJLO(int i, Object obj) {
        this.dDIMxZXP1V8HdM = i;
        this.w9sT1Swbhx3hs = obj;
    }

    private static /* synthetic */ void ufwasf() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.dDIMxZXP1V8HdM;
        Object obj = this.w9sT1Swbhx3hs;
        switch (i) {
            case 0:
                WorkDatabase workDatabase = ((maeSa89IyXlbthYlXVv) obj).dDIMxZXP1V8HdM;
                Long lW9sT1Swbhx3hs = workDatabase.hjneShqpF9Tis4().w9sT1Swbhx3hs("next_alarm_manager_id");
                int iLongValue = lW9sT1Swbhx3hs != null ? (int) lW9sT1Swbhx3hs.longValue() : 0;
                workDatabase.hjneShqpF9Tis4().vekpFI4d1Nc4fakF(new DFi6QeYwJSAjQ("next_alarm_manager_id", Long.valueOf(iLongValue != Integer.MAX_VALUE ? iLongValue + 1 : 0)));
                return Integer.valueOf(iLongValue);
            default:
                String str = SyncQYAdapter.ECwLkmPW1UKz7J6E;
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL((String) obj).openConnection();
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(httpURLConnection.getInputStream());
                httpURLConnection.disconnect();
                return bitmapDecodeStream;
        }
    }
}
