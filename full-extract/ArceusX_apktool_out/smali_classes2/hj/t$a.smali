.class public final Lhj/t$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhj/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lhj/t;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhj/t;

    invoke-direct {v0}, Lhj/t;-><init>()V

    sput-object v0, Lhj/t$a;->a:Lhj/t;

    return-void
.end method

.method public static bridge synthetic a()Lhj/t;
    .locals 1

    sget-object v0, Lhj/t$a;->a:Lhj/t;

    return-object v0
.end method
