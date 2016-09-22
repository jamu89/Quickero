# QuickOpen
An android app to quickly open your favorite apps through a notification.

# KNOWN BUGS
- some items in the installed-applications-list are wrongly sorted at the end
- slow or not appearing progress dialog while loading installed-applications-list
    - threading-problem ?
- performance-issues while moving items
- moving items are shown below the divider-line
- settings-text eventually too long (-> multiline)
- some apps are system-apps on one device but not on another (dropbox, photos, gmail, maps, ...)

# TODO
- add better texts and explanations to settings-page / style settings with images
- add empty-view for recyclerview
- check customNotification-design on all api-levels
- check activity leak on api 19 ? (open and close settings)

# TODO a little bit later
- add "about me"
- add tutorial
- add screenshots + real descriptions to google-play-page
- add red background on remove-swipe
- add feedback
- disable MainActivity when notification_enabled = false
- check for uninstalled applications every start (BroadcastReceiver)
- add "Donate a beer"
- other app-name
- add search-bar to application-list ?

# FEATURES-IDEAS (for later)
- profiles (e.g. work/home)
    - automatic change between profiles decided by time/location(/connected wifi?)

# License

```
Copyright 2016 Michael Langer (mchllngr)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```