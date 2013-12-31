/* TA-LIB Copyright (c) 1999-2007, Mario Fortier
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or
 * without modification, are permitted provided that the following
 * conditions are met:
 *
 * - Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 *
 * - Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in
 *   the documentation and/or other materials provided with the
 *   distribution.
 *
 * - Neither name of author nor the names of its contributors
 *   may be used to endorse or promote products derived from this
 *   software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * ``AS IS'' AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 * FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
 * REGENTS OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

/* List of contributors:
 *
 *  Initial  Name/description
 *  -------------------------------------------------------------------
 *  RG       Richard Gomes
 *
 * Change history:
 *
 *  YYYYMMDD BY     Description
 *  -------------------------------------------------------------------
 *  20070311 RG     First Version
 */

package com.tictactec.ta.lib.meta;


/**
 * PriceHolder is responsible for holding prices, which are composed by OHLCVI, i.e:
 * open, high, low, close, volume and open interest.
 * 
 * <p>Indicators which take prices as input, only take subsets of OHLCVI components and one could think
 * that PriceHolder could be used for such purpose. <i>This class is not intended to hold prices passed to indicators.</i>
 * 
 * <p>In order to avoid this kind of confusion, PriceHolder cannot be initialized with null arrays.
 * PriceHoder also checks if all arrays passed to constructor have the same length.
 * 
 * @author Richard Gomes
 */
public class PriceHolder {

    private double[] o;
    private double[] h;
    private double[] l;
    private double[] c;
    private double[] v;
    private double[] i;
    public final int length;
    
    /**
     * Stores all data point arrays in a PriceHolder instance
     *  
     * @param o represent the open data points and is expected to be <b>double[]</b> assignment compatible.
     * @param h represent the high data points and is expected to be <b>double[]</b> assignment compatible.
     * @param l represent the low data points and is expected to be <b>double[]</b> assignment compatible.
     * @param c represent the close data points and is expected to be <b>double[]</b> assignment compatible.
     * @param v represent the volume data points and is expected to be <b>double[]</b> assignment compatible.
     * @param i represent the open interest data points and is expected to be <b>double[]</b> assignment compatible.
     * 
     * @throws NullPointerException if any arrays is null
     * @throws IllegalArgumentException if sizes of arrays dont match
     */
    public PriceHolder(double[] o, double[] h, double[] l, double[] c, double[] v, double[] i) 
            throws NullPointerException, IllegalArgumentException {

        if (o==null) throw new NullPointerException(); // TODO: message
        if (h==null) throw new NullPointerException(); // TODO: message
        if (l==null) throw new NullPointerException(); // TODO: message
        if (c==null) throw new NullPointerException(); // TODO: message
        if (v==null) throw new NullPointerException(); // TODO: message
        if (i==null) throw new NullPointerException(); // TODO: message
        
        length = o.length;
        if (h.length != length) throw new IllegalArgumentException(); // TODO: message
        if (l.length != length) throw new IllegalArgumentException(); // TODO: message
        if (c.length != length) throw new IllegalArgumentException(); // TODO: message
        if (v.length != length) throw new IllegalArgumentException(); // TODO: message
        if (i.length != length) throw new IllegalArgumentException(); // TODO: message
        
        this.o = o;
        this.h = h;
        this.l = l;
        this.c = c;
        this.v = v;
        this.i = i;
    }
    
    /**
     * This method is deprecated. Use public field "length" instead.
     * @deprecated
     * @return length
     */
    public int getSize() {
        return length;
    }
    
    /**
     * @return an Object[] which contais <b>all<b> data point arrays OHLCVI.
     * @see PriceInputParameter overrides this method
     */
    public Object[] toArrays() {
        Object objs[] = new Object[6];
        int n = 0;
        objs[n++] = o;
        objs[n++] = h;
        objs[n++] = l;
        objs[n++] = c;
        objs[n++] = v;
        objs[n++] = i;
        return objs;
    }

    /**
     * 
     * @return the Open component
     */
    public double[] getO() { return o; }
    
    /**
     * 
     * @return the High component
     */
    public double[] getH() { return h; }
    
    /**
     * 
     * @return the Low component
     */
    public double[] getL() { return l; }
    
    /**
     * 
     * @return the Close component
     */
    public double[] getC() { return c; }
    
    /**
     * 
     * @return the Volume component
     */
    public double[] getV() { return v; }
    
    /**
     * 
     * @return the Open Interest component
     */
    public double[] getI() { return i; }
    
}

