.class public final Lxq/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxq/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lxq/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxq/b;

    invoke-direct {v0}, Lxq/b;-><init>()V

    sput-object v0, Lxq/b$a;->a:Lxq/b;

    return-void
.end method
