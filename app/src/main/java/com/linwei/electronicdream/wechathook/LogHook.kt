package com.linwei.electronicdream.wechathook

import android.util.Log
import com.gh0u1l5.wechatmagician.spellbook.interfaces.IXLogHook

object LogHook : IXLogHook{
    override fun onXLogWrite(level: String, tag: String, msg: String) {
        super.onXLogWrite(level, tag, msg)
        when(level){
            "INFO" -> Log.i("HOOKEDXLOG "+tag,msg)
            "ERROR" -> Log.e("HOOKEDXLOG "+tag,msg)
            "WARNING" -> Log.w("HOOKEDXLOG "+tag,msg)
            else -> Log.e("HOOKEDXLOG level: " +level + "TAG: " + tag, msg)
        }
    }
}