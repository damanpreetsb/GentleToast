# GentleToast
Android library to customize toasts<br>

### DEMO
<br>
<p align="start">
<img src="https://github.com/DamanSingh4321/GentleToast/blob/master/screenshots/done_toast.gif?raw=true" width="250">

<img src="https://github.com/DamanSingh4321/GentleToast/blob/master/screenshots/custom_toast.gif?raw=true" width="250">

<img src="https://github.com/DamanSingh4321/GentleToast/blob/master/screenshots/simple_toast.gif?raw=true" width="250">
</p>

### DOWNLOAD
<p>Add this to your root <code>build.gradle</code> file</p>

<pre><code>allprojects {
        repositories {
            ...
            maven { url "https://jitpack.io" }
        }
    }
</code></pre>

<p>Add this to your app module's <code>build.gradle</code> file</p>

<pre><code>dependencies {
            compile 'com.github.DamanSingh4321:GentleToast:1.0'
    }
</code></pre>
<br>

### USAGE
##### For simple use:
<pre><code> GentleToast.with(this)
                .shortToast("Simple!")
                .show();</code></pre>
                
##### For custom use:
<pre><code> GentleToast.with(this)
                 .longToast("Custom!")
                 .setTextColor(R.color.white)
                 .setBackgroundColor(R.color.colorPrimaryDark
                 .setBackgroundRadius(16)
                 .setStrokeColor(R.color.colorAccent)
                 .setStrokeWidth(4)
                 .setImage(R.mipmap.ic_launcher)
                 .show();</code></pre>
                 
##### For pre-defined views:
<pre><code> GentleToast.with(this)
                 .longToast("Done!", GentleToast.DONE)
                 .show();</code></pre>
                 
###### Available pre-defined views:
- GentleToast.DONE
<br>
                 
                 
<table>

<tr>
<th>Method Name</th>
<th>Description</th>
<th>Parameter(s)</th>
<th>Default</th>
</tr>
<tr>
<td>with</td>
<td>Context</td>
<td>Context</td>
<td></td>
</tr>
<tr>
<td>longToast/shortToast</td>
<td>For long/short toast</td>
<td>String message, int ToastType</td>
<td></td>
</tr>
<tr>
<td>setTextColor</td>
<td>To change text color</td>
<td>int color</td>
<td>white</td>
</tr>
<tr>
<td>setBackgroundColor</td>
<td>To change background color</td>
<td>int color</td>
<td>black</td>
</tr>
<tr>
<td>setBackgroundRadius</td>
<td>To change corner of background</td>
<td>int radius</td>
<td>20</td>
</tr>
<tr>
<td>setStrokeColor</td>
<td>To change stroke color</td>
<td>int color</td>
<td>black</td>
</tr>
<tr>
<td>setStrokeWidth</td>
<td>To change stroke width</td>
<td>int width</td>
<td>0</td>
</tr>
<tr>
<td>setImage</td>
<td>To add image</td>
<td>int image</td>
<td></td>
</tr>
<tr>
<td>show</td>
<td>To show toast</td>
<td></td>
<td></td>
</tr>

</table>


### License
<pre><code>Copyright 2017 Damanpreet Singh

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

</code></pre>
