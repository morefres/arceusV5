.class public final Lmp/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmp/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lmp/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmp/f;

    invoke-direct {v0}, Lmp/f;-><init>()V

    sput-object v0, Lmp/f$a;->a:Lmp/f;

    return-void
.end method
