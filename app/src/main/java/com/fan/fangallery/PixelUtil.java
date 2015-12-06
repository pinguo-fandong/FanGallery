package com.fan.fangallery;

import android.content.Context;
import android.content.res.Resources;


/**
 * time: 15/7/17
 * description:像素转换器
 *
 * @author fandong
 */
public class PixelUtil {

    /**
     * The context.
     */
    private static Context mContext = GalleryApplication.gContext;

    /**
     * dp转 px.
     *
     * @param value the value
     * @return the int
     */
    public static float dp2px(float value) {
        final float scale = mContext.getResources().getDisplayMetrics().densityDpi;
        return value * scale / 160 + 0.5f;
    }

    /**
     * dp转 px.
     *
     * @param value   the value
     * @param context the context
     * @return the int
     */
    public static float dp2px(float value, Context context) {
        final float scale = context.getResources().getDisplayMetrics().densityDpi;
        return value * scale / 160 + 0.5f;
    }

    /**
     * px转dp.
     *
     * @param value the value
     * @return the int
     */
    public static float px2dp(float value) {
        final float scale = mContext.getResources().getDisplayMetrics().densityDpi;
        return value * 160 / scale + 0.5f;
    }

    /**
     * px转dp.
     *
     * @param value   the value
     * @param context the context
     * @return the int
     */
    public static float px2dp(float value, Context context) {
        final float scale = context.getResources().getDisplayMetrics().densityDpi;
        return value * 160 / scale + 0.5f;
    }

    /**
     * sp转px.
     *
     * @param value the value
     * @return the int
     */
    public static int sp2px(float value) {
        Resources r;
        if (mContext == null) {
            r = Resources.getSystem();
        } else {
            r = mContext.getResources();
        }
        float spvalue = value * r.getDisplayMetrics().scaledDensity;
        return (int) (spvalue + 0.5f);
    }

    /**
     * sp转px.
     *
     * @param value   the value
     * @param context the context
     * @return the int
     */
    public static int sp2px(float value, Context context) {
        Resources r;
        if (context == null) {
            r = Resources.getSystem();
        } else {
            r = context.getResources();
        }
        float spvalue = value * r.getDisplayMetrics().scaledDensity;
        return (int) (spvalue + 0.5f);
    }

    /**
     * px转sp.
     *
     * @param value the value
     * @return the int
     */
    public static int px2sp(float value) {
        final float scale = mContext.getResources().getDisplayMetrics().scaledDensity;
        return (int) ((value - 0.5) / scale);
    }

    /**
     * px转sp.
     *
     * @param value   the value
     * @param context the context
     * @return the int
     */
    public static int px2sp(float value, Context context) {
        final float scale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (value / scale + 0.5f);
    }

    public static int getWidthDp(Context context) {
        int screenWidth = ResHelper.getScreenWidth();
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (screenWidth * 1.0f / scale);
    }

}
