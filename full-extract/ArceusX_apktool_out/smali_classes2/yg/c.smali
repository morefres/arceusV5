.class public Lyg/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyg/a;


# instance fields
.field public final a:Lorg/webrtc/voiceengine/AppAudioManagerBase;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lgv/e;->g(Landroid/content/Context;)Lgv/e;

    move-result-object p1

    iput-object p1, p0, Lyg/c;->a:Lorg/webrtc/voiceengine/AppAudioManagerBase;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lyg/c;->a:Lorg/webrtc/voiceengine/AppAudioManagerBase;

    invoke-virtual {v0}, Lorg/webrtc/voiceengine/AppAudioManagerBase;->dispose()V

    return-void
.end method

.method public b(Lj/b;)V
    .locals 1

    iget-object v0, p0, Lyg/c;->a:Lorg/webrtc/voiceengine/AppAudioManagerBase;

    invoke-virtual {v0, p1}, Lorg/webrtc/voiceengine/AppAudioManagerBase;->setActivityForPermissionRequest(Lj/b;)V

    return-void
.end method
