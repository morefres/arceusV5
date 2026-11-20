.class public final Ljj/a$b;
.super Lot/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljj/a;->b(Lkotlin/jvm/functions/Function0;Lmt/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lot/f;
    c = "com.roblox.client.pushnotification.http.PushNotificationService"
    f = "PushNotificationService.kt"
    l = {
        0x54,
        0x56
    }
    m = "deregisterCurrentDeviceSuspend"
    v = 0x1
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:I

.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Ljj/a;

.field public y:I


# direct methods
.method public constructor <init>(Ljj/a;Lmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljj/a;",
            "Lmt/b<",
            "-",
            "Ljj/a$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ljj/a$b;->x:Ljj/a;

    invoke-direct {p0, p2}, Lot/d;-><init>(Lmt/b;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iput-object p1, p0, Ljj/a$b;->w:Ljava/lang/Object;

    iget p1, p0, Ljj/a$b;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ljj/a$b;->y:I

    iget-object p1, p0, Ljj/a$b;->x:Ljj/a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Ljj/a;->b(Lkotlin/jvm/functions/Function0;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
