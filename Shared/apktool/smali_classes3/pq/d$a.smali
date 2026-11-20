.class public final Lpq/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpq/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lpq/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpq/d;

    invoke-direct {v0}, Lpq/d;-><init>()V

    sput-object v0, Lpq/d$a;->a:Lpq/d;

    return-void
.end method
