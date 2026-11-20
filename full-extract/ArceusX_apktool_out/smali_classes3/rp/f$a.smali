.class public final Lrp/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrp/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lrp/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lrp/f;

    invoke-direct {v0}, Lrp/f;-><init>()V

    sput-object v0, Lrp/f$a;->a:Lrp/f;

    return-void
.end method
