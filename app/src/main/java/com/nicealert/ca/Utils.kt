package com.nicealert.ca

import android.app.Activity
import android.content.res.Resources
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class Utils {

    companion object{

        fun showAlertSuccess(activity: Activity, resources: Resources, title: String?, message: String){
            Alerter.create(activity, R.layout.custom_layout)
                .setBackgroundColorRes(R.color.colorAlertSuccess)
                .enableSwipeToDismiss()
                .setDuration(3000)
                .also { alerter ->
                    val layout = alerter.getLayoutContainer()
                    var ivIcon: ImageView = layout?.findViewById<View>(R.id.ivIcon) as ImageView
                    var tvTitle: TextView = layout?.findViewById<View>(R.id.tvTitle) as TextView
                    var tvMessage: TextView = layout?.findViewById<View>(R.id.tvMessage) as TextView

                    ivIcon.setImageDrawable(resources.getDrawable(R.drawable.ic_success))
                    if (title == null) {
                        tvTitle.visibility = View.GONE
                    } else {
                        tvTitle.text = title
                    }
                    tvMessage.text = message
                }
                .show()
        }

        fun showAlertError(activity: Activity, resources: Resources, title: String?, message: String){
            Alerter.create(activity, R.layout.custom_layout)
                .setBackgroundColorRes(R.color.colorAlertError)
                .enableSwipeToDismiss()
                .setDuration(3000)
                .also { alerter ->
                    val layout = alerter.getLayoutContainer()
                    var ivIcon: ImageView = layout?.findViewById<View>(R.id.ivIcon) as ImageView
                    var tvTitle: TextView = layout?.findViewById<View>(R.id.tvTitle) as TextView
                    var tvMessage: TextView = layout?.findViewById<View>(R.id.tvMessage) as TextView

                    ivIcon.setImageDrawable(resources.getDrawable(R.drawable.ic_error))
                    if (title == null) {
                        tvTitle.visibility = View.GONE
                    } else {
                        tvTitle.text = title
                    }
                    tvMessage.text = message
                }
                .show()
        }

        fun showAlertWarning(activity: Activity, resources: Resources, title: String?, message: String){
            Alerter.create(activity, R.layout.custom_layout)
                .setBackgroundColorRes(R.color.colorAlertWarning)
                .enableSwipeToDismiss()
                .setDuration(3000)
                .also { alerter ->
                    val layout = alerter.getLayoutContainer()
                    var ivIcon: ImageView = layout?.findViewById<View>(R.id.ivIcon) as ImageView
                    var tvTitle: TextView = layout?.findViewById<View>(R.id.tvTitle) as TextView
                    var tvMessage: TextView = layout?.findViewById<View>(R.id.tvMessage) as TextView

                    ivIcon.setImageDrawable(resources.getDrawable(R.drawable.ic_info))
                    if (title == null) {
                        tvTitle.visibility = View.GONE
                    } else {
                        tvTitle.text = title
                    }
                    tvMessage.text = message
                }
                .show()
        }
    }
}