.class public final Lup/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lup/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lup/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lup/d;

    invoke-direct {v0}, Lup/d;-><init>()V

    sput-object v0, Lup/d$a;->a:Lup/d;

    return-void
.end method
